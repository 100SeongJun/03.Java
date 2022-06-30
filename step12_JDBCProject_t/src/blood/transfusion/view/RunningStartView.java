package blood.transfusion.view;

import blood.transfusion.contoller.BTController;

public class RunningStartView {

	public static void main(String[] args) {
		BTController controller = BTController.getInstance();

		System.out.println("===== 1.모든 프로젝트 검색 =====");

		controller.allBTProjects();
		System.out.println();

		System.out.println("===== 2.특정 프로젝트 검색 =====");
		controller.selectBTProject();
		System.out.println();
		System.out.println("===== 3.새로운 헌혈자 저장 =====");
		controller.insertDonor();
		System.out.println();

		System.out.println("===== 4.새로운 수혈자 저장 =====");
		controller.insertRecipient();
		System.out.println();

		System.out.println("===== 5.새로운 프로젝트 저장 =====");
		controller.insertBTProject();
		System.out.println();

		System.out.println("===== 6.특정 프로젝트 업데이트 =====");
		controller.UpdateBTProject();
		System.out.println();

		System.out.println("===== 7.특정 프로젝트 삭제 =====");
		controller.removeBTProject();
		System.out.println();

		System.out.println("===== 8.특정 헌혈자 삭제=====");
		controller.removeDonor();

		System.out.println("===== 9.모든 헌혈자 검색 =====");
		controller.getAllDonors();
		System.out.println();

		System.out.println("===== 10.모든 수혈자 검색 =====");
		controller.getAllRecipient();
		System.out.println();

	}
}
