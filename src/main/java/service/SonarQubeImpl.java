package service;

import dto.ResponseDto;

public class SonarQubeImpl implements SonarQube {
    @Override
    public ResponseDto testByEnv(String env) {
        return new ResponseDto("VALID");
    }

    private void sonarInvalidCode() {
        String firstName = getFirstName(); // String overrides equals
        String lastName = getLastName();

        if (firstName == lastName) {
            System.out.println("Block for sonar!");
        }// Non-compliant; false even if the strings have the same value
    }

    private String getLastName() {
        return "Last name";
    }

    private String getFirstName() {
        return "First name";
    }

}
