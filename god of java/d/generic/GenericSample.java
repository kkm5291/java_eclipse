package d.generic;

public class GenericSample {
	public static void main(String[] args) {
		GenericSample sample = new GenericSample();
		sample.checkCastingDTO();
		
		
	}
	
	public void checkCastingDTO() {
		CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
		dto1.setObject(new String());
		
		CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
		dto2.setObject(new StringBuffer());
		
		CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
		dto3.setObject(new StringBuilder());
	}
}
