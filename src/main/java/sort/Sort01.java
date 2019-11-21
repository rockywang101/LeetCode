package sort;

import java.util.Random;

public class Sort01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// 產生一個排序過的 int array
		int[] nums = new int[30000000];
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			int n = random.nextInt(2) + 1; // 1 ~ 3
			num = num + n;
			nums[i] = num;
		}
		
		int wantNum = random.nextInt(nums[nums.length-1]);
		System.out.println("maxm num: " + nums[nums.length-1]);
		System.out.println("find num: " + wantNum);
		
		long begin = System.currentTimeMillis();

		int position = findNum(nums, wantNum);
		
		long diff = System.currentTimeMillis() - begin;
		
		// 查看結果
		if (position > 0)
			System.out.println("find at position " + position);
		else 
			System.out.println("not found");
		
		System.out.println("spent time " + diff);
	}
	
	private static int findNum(int[] nums, int wantNum) {
		// 找出是否存在
		int position = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == wantNum) {
				position = i;
				break;
			}
		}		
		return position;
	}
}
