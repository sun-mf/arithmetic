package common;

/*
 * λ����Ϣ
 */
public class Location {

	public Location(int x, int y) {
		m_x = x;
		m_y = y;
	}

	/*
	 * ����λ�ü����
	 */
	public static int distance(Location x, Location y) throws Exception {
		if (x == null || y == null) {
			throw new Exception("location cant is null");
		}
		return Math.abs(x.m_x - y.m_x) * Math.abs(x.m_y - y.m_y);
	}

	// x����
	public int m_x;

	// y����
	public int m_y;
}