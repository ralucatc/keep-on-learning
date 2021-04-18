package com.pad.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //add fields for email address annd team
    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside setter method: - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("inside setter method: - setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    //create a no-arg constructor
    public CricketCoach(){
        System.out.println("CricketCoach: inside no arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside the setter method of CricketCoach");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
