package blood.transfusion.contoller;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.BTService;
import blood.transfusion.model.DonorDAO;
import blood.transfusion.model.RecipientDAO;
import blood.transfusion.view.RunningEndView;
import blood.transfusion.view.RunningSuccessView;

public class BTController {
	private static BTController instance = new BTController();
	private BTService service = BTService.getInstance();

	private BTController() {
	}

	public static BTController getInstance() {
		return instance;
	}

	// 모든 프로젝트 검색
	public void allBTProjects() {
		try {
			RunningEndView.projectListView(service.getAllBTProjects());
			RunningSuccessView.showSuccess("모든 프로젝트 검색 성공");
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든 프로젝트 검색시 에러 발생");
		}

	}

	// 특정 프로젝트 검색
	public void selectBTProject() {
		try {
			RunningEndView.projectView(service.getBTProject("bt5"));
//			RunningSuccessView.showSuccess("특정 프로젝트 검색 성공");
		} catch (SQLException e) {
			RunningEndView.showError("<SQLException> 특정 프로젝트 검색시 에러 발생");
		} catch (NotExistException e) {
			RunningEndView.showError("<notException>특정 프로젝트 검색시 에러 발생");
		}
	}

	// 새로운 프로젝트 저장 로직
	public void insertBTProject() {
		try {
			BTProjectDTO project = new BTProjectDTO("AB-", "bt6", "donor3", "recipient3", "AB형간의 수혈");
			service.addBTProject(project);
			RunningEndView.projectView(project);
			RunningSuccessView.showSuccess("새로운 프로젝트 저장 성공");

		} catch (SQLException e) {
			RunningEndView.showError("중복된 기본키입니다.");
		}
	}

	public void insertDonor() {
		DonorDTO donor = new DonorDTO("donor6", "헌혈4", 28, "M", "AB-", "심심해서");
		try {
			service.addDonor(donor);
		} catch (SQLException e) {
			RunningEndView.showError("기본키에러");
		}
	}

	public void insertRecipient() {
		RecipientDTO recipient = new RecipientDTO("recipient6", "헌혈4", 28, "M", "AB-", "그냥");
		try {
			service.addRecipient(recipient);
		} catch (SQLException e) {
			RunningEndView.showError("기본키에러");
		}

	}

	// 특정 프로젝트 업데이트
	public void UpdateBTProject() {
		String projectName = "bt1";
		String donorName = "donor3";
		try {
			if (service.updateBTProject(projectName, donorName)) {
				RunningEndView.projectView(service.getBTProject(projectName));
				RunningSuccessView.showSuccess("특정 프로젝트 업데이트 성공");
			} else {
				RunningEndView.showError("업데이트 할 정보가 없습니다.");
			}
		} catch (SQLException e) {
			RunningEndView.showError("SQLERROR");
		} catch (NotExistException e) {
			System.out.println(e);
			RunningEndView.showError("<notException>특정 프로젝트 저장시 에러 발생");
		}
	}

	// 특정 프로젝트 삭제
	public void removeBTProject() {
		String projectid = "bt2";
		try {
			if (service.deleteBTProject(projectid)) {
				RunningEndView.projectListView(service.getAllBTProjects());
			} else {
				RunningEndView.showError("삭제할 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NotExistException e) {
			e.printStackTrace();
		}

	}

	// 특정 헌혈자 삭제
	public void removeDonor() {
		String donor_id = "Donor4";

		try {
			if (service.deleteDonor(donor_id)) {
				String btprojectid = service.getBTPid(donor_id);
			}
			;

		} catch (SQLException | NotExistException e) {
		}
	}

	// 모든 헌혈자 검색 로직
	public ArrayList<DonorDTO> getAllDonors() {
		ArrayList<DonorDTO> allProject = null;
		try {
			RunningEndView.projectListView(DonorDAO.getAllDonors());
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든  헌혈자 검색시 에러 발생");
		}
		return allProject;
	}

	// 모든 수혈자 검색
	public ArrayList<DonorDTO> getAllRecipient() {
		ArrayList<DonorDTO> allProject = null;
		try {
			RunningEndView.projectListView(RecipientDAO.getAllRecipients());
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든  수혈자 검색시 에러 발생");
		}
		return allProject;
	}

}
