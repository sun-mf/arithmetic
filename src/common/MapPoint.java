package common;

/*
 * ��ͼ�ĵ�
 */
public class MapPoint {

	public MapPoint(int x, int y, int weight) {
		m_location = new Location(x, y);
		m_weight = weight;
	}

	/*
	 * ��ȡȨ��
	 */
	public int getWeight() {
		return m_weight;
	}

	/*
	 * ��ȡλ����Ϣ
	 */
	public Location getLocation() {
		return m_location;
	}

	// λ��
	private Location m_location;

	// Ȩ��
	private int m_weight;
}
