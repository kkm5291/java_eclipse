package Chapter3;
abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	
	abstract String get(String key); // key값을 가진 value 리턴, 없으면 null 리턴
	abstract void put(String key, String value); // key와 value 쌍으로 저장, 기존에 key가 있으면, 값을 value로 수정
	abstract String delete(String key); // key 값을 가진 아이템(value와 함께) 삭제, 삭제된 value값 리턴
	abstract int length(); // 현재 저장된 아이템의 개수 리턴
}
class Dictionary extends PairMap {
	int num;
	int cnt=0;
	public Dictionary(int num) {
		this.num = num;
		keyArray = new String[num];
		valueArray = new String[num];
	}
	@Override
	public String get(String key) {
		for(int i=0; i<cnt; i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}
	
	public void put(String key, String value) {
		for(int i=0; i<cnt; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value;
				cnt--;
			}
		}
		keyArray[cnt] = key;
		valueArray[cnt] = value;
		cnt++;
	}
	
	public String delete(String key) {
//		String prev_value = null;
//		int index = 0;
//		for(int i=0; i<num; i++) {
//			if(key.equals(keyArray[i])) {
//				index = i;
//				keyArray[index] = null;
//				prev_value = valueArray[index];
//				valueArray[index] = null;
//			}
//		}
		for(int i=0; i<cnt; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = "null";
				return "null";
			}
		}
		return "해당값은 없습니다.";
	}
	
	public int length() {
		return cnt;
	}
}
public class practice_10 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++"); //이재문 값을 C++로 수정
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));	
	}
}
