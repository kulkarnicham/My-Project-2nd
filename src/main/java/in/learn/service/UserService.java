package in.learn.service;

import java.util.Map;

import in.learn.bindings.LoginForm;
import in.learn.bindings.RegisterForm;
import in.learn.bindings.ResetPwdForm;
import in.learn.entity.User;

public interface UserService {

	public Map<Integer, String> getCountries();

	public Map<Integer, String> getStates(Integer countryId);

	public Map<Integer, String> getCities(Integer stateId);

	public User getUser(String email);

	public boolean saveUser(RegisterForm formObj);

	public User login(LoginForm formObj);

	public boolean resetPwd(ResetPwdForm formObj);

}
