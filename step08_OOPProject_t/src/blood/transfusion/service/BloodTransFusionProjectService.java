package blood.transfusion.service;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.Donor;
import blood.transfusion.dto.People;
import blood.transfusion.dto.Recipient;
import blood.transfusion.model.BloodTransfusionVirtualDB;
import blood.transfusion.view.EndView;

public class BloodTransFusionProjectService {
	private static BloodTransFusionProjectService instance = new BloodTransFusionProjectService();
	private BloodTransfusionVirtualDB projectVirtualData = BloodTransfusionVirtualDB.getInstance();

	private BloodTransFusionProjectService() {
	}

	public static BloodTransFusionProjectService getInstance() {
		return instance;
	}

	// 모든 프로젝트 반환
	public ArrayList<BloodTransfusionProject> getAllProjects() {
		return projectVirtualData.getProjectList();
	}

	// 프로젝트 검색_
	public void getProject(String projectName) {
		ArrayList<BloodTransfusionProject> lists = new ArrayList<BloodTransfusionProject>();
		projectVirtualData.getProjectList().stream().filter(s -> s.getBtProjectName().equals(projectName))
				.forEach(v -> lists.add(v));
		if (0 < lists.size()) {

			for (BloodTransfusionProject result : lists) {
				System.out.println(result);
			}
		} else {
			EndView.messageView("검색 요청하신 프로젝트는 존재하지 않습니다\r\n");
		}
	}

	// 새로운 프로젝트 추가
	public void projectInsert(BloodTransfusionProject newProject) {
		projectVirtualData.insertProject(newProject);
	}

	// 프로젝트 수정 - 프로젝트 명으로 현혈자 혹은 수혈자 수정_
	public void projectUpdate(String projectName, People people) throws NotExistException {
		projectVirtualData.getProjectList().stream().filter(v -> v.getBtProjectName().equals(projectName))
				.forEach(v -> {
					if (people instanceof Recipient) {
						v.setRecipient((Recipient) people);
					} else {
						v.setDonor((Donor) people);
					}
					System.out.println();
				});

	}

	// 프로젝트 삭제_
	public void projectDelete(String projectName) throws NotExistException {
		boolean check = true;
		for (int i = 0; i < getAllProjects().size(); i++) {
			if (projectName.equals(getAllProjects().get(i).getBtProjectName())) {
				getAllProjects().remove(i);
				check = false;
				EndView.messageView("해당 Project가 삭제되었습니다.");
			}
		}
		if (check) {
			throw new NotExistException("삭제 실패했습니다.");
		}

//		for (BloodTransfusionProject project : projectVirtualData.getProjectList()) {
//			if (project.getBtProjectName().equals(projectName)) {
//				list.add(project);
//				projectVirtualData.getProjectList().remove(project);
//				EndView.projectListView(getAllProjects());
//				return false;
//
//			}
//		}
//		EndView.projectListView(getAllProjects());
//		return false;
	}
}
