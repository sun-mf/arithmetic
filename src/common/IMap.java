package common;

/*
 * ��ͼ��
 */
public interface IMap {
	
	/*
	 * ��ʼ����ͼ
	 */
	void init(int x, int y);
	
	/*
	 * ��ȡ��ͼ����
	 */
	MapPoint getMapPoint(Location location);
	
	/*
	 * ��ȡ������Ȩ�ؾ���
	 */
	int getDistanceWithWeight(MapPoint x, MapPoint y);
	
	/*
	 * ��ȡ��ͼ�ߴ�
	 */
	Location getSize();
}
