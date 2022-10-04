package c.string;

public class StringCheck {

	public static void main(String[] args) {
		StringCheck sample = new StringCheck();
		
		String addresses[] = new String[] {
				"서울시 구로구 신림동",
				"서울시 강서구 마곡동",
				"경기도 성남시 분당구 정자동 개발 공장"
		};
		
		sample.checkAddress(addresses);
	}
	
	public void checkAddress(String[] addresses) {
		int startCount=0, endCount=0;
		String startText="서울시";
		String endText="동";
		for(String address:addresses) {
			if(address.startsWith(startText)) {
				startCount++;
			}
			if(address.endsWith(endText)) {
				endCount++;
			}
		}
		System.out.println("시작단어 카운트" + startCount);
		System.out.println("끝 단어 카운트" + endCount);
	}
	
	public void checkIndexOf() {
		String text="Java technology is both a programming language and a platform";
		System.out.println(text.indexOf('a'));
	}
}
