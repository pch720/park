package poly.service;

import poly.dto.UserDTO;

public interface IUserService {

	int userRegProc(UserDTO uDTO)throws Exception;
	
	int userReceive(UserDTO uDTO)throws Exception;

	int forgetEmail(UserDTO uDTO)throws Exception;

	String email1(UserDTO uDTO)throws Exception;

	int forgetPassword(UserDTO uDTO)throws Exception;

	String pw(UserDTO uDTO)throws Exception;

	String email2(UserDTO uDTO)throws Exception;

	String que(UserDTO uDTO) throws Exception;

	int answer(UserDTO uDTO) throws Exception;

	UserDTO getUserInfo(UserDTO uDTO) throws Exception;

	int pCheck(String phone) throws Exception;

	int eCheck(String email) throws Exception;
}
