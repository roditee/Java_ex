package Array;

public class ex05 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		int max = -1;
		int i;
		
		for (i=0; i<scores.length; i++) {
			if (max < scores[i]) max = scores[i];
		}
		for (i=0; i<hakbuns.length; i++) {
			if (max == scores[i]) {
				System.out.println("1�� �л� �й� : " + hakbuns[i]);
				System.out.println("1�� �л� ���� : " + scores[i]);
			}
		}
		
//		�Ǵ�
//		int maxScore = 0;
//		int maxIdx = 0;
//		for (i=0; i<scores.length; i++) {
//			if (scores[i] > maxScore) {
//				maxScore = scores[i];
//				maxIdx = i;
//			}
//		}
//		System.out.println("1�� �л� �й� : " + maxIdx);
//		System.out.println("1�� �л� ���� : " + maxScore);
	}
}
