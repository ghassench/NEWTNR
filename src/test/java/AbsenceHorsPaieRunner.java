/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@Cucumber.Options(format = { "pretty",
    "json:target/cucumberHRA.json" },tags= "ABSHP"
		)
public class AbsenceHorsPaieRunner {
    
}
