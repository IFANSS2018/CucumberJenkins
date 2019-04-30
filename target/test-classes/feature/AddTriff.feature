#Author: your.email@your.domain.com
@tag
Feature: To test addtriff plan
 

   @palpandi
  Scenario Outline: to test addtriff plan valid detaild
  	Given the user is in add triff plan
  	When the user fill valid details "<MonRen>","<LocMin>","<InterMin>","<SMSPack>","<LocMinChar>","<InterMinChar>","<SMSsChar>"
  	When the user click submit button
  	Then the user see the successfll message
    
    Examples: 
     |MonRen|LocMin|InterMin|SMSPack|LocMinChar|InterMinChar|SMSsChar|
     |100		|200	 |300			|400		|500			|600					|700			|
    # |100		|200	 |300			|400		|500			|600					|700			|
   #  |100		|200	 |300			|400		|500			|600					|700			|

    @kalai
  Scenario Outline: to test addtriff plan valid detaild
  	Given the user is in add triff plan
  	When the user fill valid details "<MonRen>","<LocMin>","<InterMin>","<SMSPack>","<LocMinChar>","<InterMinChar>","<SMSsChar>"
  	When the user click submit button
  	Then the user see the successfll message
    
    Examples: 
     |MonRen|LocMin|InterMin|SMSPack|LocMinChar|InterMinChar|SMSsChar|
     |1000		|2000	 |3000			|4000	|5000		|6000				|7000		|