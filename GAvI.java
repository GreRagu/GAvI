
public class GAvI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IndexFiles.main(null);
		String[] entry = new String[1];
		entry[0] = "-index ./index";
		try {
			SearchFiles.main(entry);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
