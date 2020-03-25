package by.htp.library.start;

import by.htp.library.bean.User;
import by.htp.library.controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();

		String request, response;

		request = "REGISTRATION login=yyr password=ytr name=irina surname=ivanova";
		//request = "authorization login=qqq password=www";

		response = controller.action(request);

		System.out.println(response);
	}
}
