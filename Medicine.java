import java.io.*;
import java.util.*;
public class Medicine
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Date time = new Date();
    int a1, a2, a3 = 0;
    String t;
    static int flag = 1;
    String diseaseconfirm;
    public void Begin()throws IOException
    {
        System.out.println("Welcome to Dr. Atharva's Clinic.\nThis is a program developed to check for some of the diseases found today.");
        System.out.println("Please Enter your name.");
        String name = br.readLine();
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Hello, " + name + ". What do you wish to do?");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1.Diagnosis          ");
        System.out.println("2.After diagnosis   ");
        System.out.println("3.Free Health Tip   ");
        System.out.println("4.Water Consumption ");
        System.out.println("5.Queries           ");
        System.out.println("6.Exit              ");
        System.out.println("----------------------------------------------------------------------");
        a2 = Integer.parseInt(br.readLine());
        if(a2 == 6)
        {
            System.out.println("Thank you and have a nice day!");
            System.exit(1);
        }
        else if(a2 == 4)
        {
            try
            {
                System.out.println("********************************************************************************************************************************************************************************************");
                System.out.println("Water has many benefits, that are surely not needed to be stated here. \nTo know the amount of water you neeed to consume, please enter your weight below\nWEIGHT:");
                int water = Integer.parseInt(br.readLine());
                int waterweight = water * 33;
                double waterweight2 = waterweight/1000;
                System.out.println("The amount of water you need to consume is - " + waterweight + " ml, or " + Math.round(waterweight2) + " l.");
            }
            catch(Exception e)
            {
                System.out.println("Sorry. Wrong input.....");
                System.exit(0);
            }
        }
        else if(a2 == 3)
        {
            int hflag = (int)(Math.random()*(10 - 1) + 1);
            if(hflag == 1)
            {
                System.out.println("Your tip is : \nPeople whose diets are rich in potassium may be less prone to high blood pressure. Besides reducing sodium and taking other heart-healthy steps, eat potassium-packed picks such as bananas, cantaloupe, and oranges.");
            }
            else if(hflag == 2)
            {
                System.out.println("Your tip is : \nAdding raw or lightly cooked garlic and onions to your meals may help keep you healthy this winter. Both foods appear to possess antiviral and antibacterial properties and are believed to boost immunity.");
            }
            else if(hflag == 3)
            {
                System.out.println("Your tip is : \nFor heel and arch pain, try stretching your foot by rolling it over a rolling pin or a bottle.");
            }
            else if(hflag == 4)
            {
                System.out.println("Your tip is : \nTame tension headaches by rubbing peppermint oil, Tiger Balm, or white flower oil into your temples. All three remedies contain menthol, which has analgesic properties.");
            }
            else if(hflag == 5)
            {
                System.out.println("Your tip is : \nIs your energy lagging? Though it may be the last thing you feel like doing when you're tired, exercise -- even a brisk walk -- can be more effective than a nap or cup of coffee at fighting fatigue.");
            }
            else if(hflag == 6)
            {
                System.out.println("Your tip is : \nCranberries contain a substance that appears to keep bacteria from sticking to the walls of the urinary tract and has been shown to help prevent UTIs.");
            }
            else if(hflag == 7)
            {
                System.out.println("Your tip is : \nTo fend off colds, washing your hands well and often is the best step you can take. Use plain soap and water and scrub for as long as it takes to sing 'Happy Birthday to You' twice!");
            }
            else if(hflag == 8)
            {
                System.out.println("Your tip is : \nFennel seeds are considered a carminative, a substance that helps relieve gas. Chew and then swallow about half a teaspoon of the seeds after meals.");
            }
            else if(hflag == 9)
            {
                System.out.println("Your tip is : \nFor healthy gums, put this green vegetable on your grocery list. It's an excellent source of vitamin C and provides calcium as well, both of which have been linked to lower rates of periodontal disease.");
            }
            else if(hflag == 10)
            {
                System.out.println("Your tip is : \nTo soothe a sore throat, try slippery elm, which can help ease pain by coating irritated tissue. Look for slippery elm lozenges and suck on them as needed.");
            }
            System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("Thank you and have a nice day. Please take care of your health as - 'Health is Wealth'.......");
            flag++;
        }
        else if (a2 == 1)
        {
           try
           {
              System.out.println("Enter the numbers assigned with the symptoms you suffer from, one after the other."); 
              System.out.println("********************************************************************************************************************************************************************************************");
              System.out.println(" 1.Periodic chills followed by a fever      6.Fatigue                                    11.Extreme prolonged cold      16.Diarrhoea                    21.Unexplainable Tiredness          ");
              System.out.println(" 2.Severe Headaches                         7.Severe pain behind the eyes                12.High Fever                  17.Blood with Faeces            22.Wheezing                         ");
              System.out.println(" 3.Profuse(Excessive) sweating              8.Severe Pain in the chest                   13.Shallow Rasp breathing      18.Yellowish or plae skin       23.Bleeding from nose, eyes, ears   ");
              System.out.println(" 4.Nausea                                   9.Weight loss                                14.Trouble Breathing           19.Pale and yellowish eyes      24.Fainted                          ");
              System.out.println(" 5.Vomiting                                10.Extreme weight loss(drop by say 10kg)      15.Loss in appetite            20.Quick Exhaustion             25.Joint Pain                       ");
              System.out.println("********************************************************************************************************************************************************************************************");
              System.out.println("Please enter the first number.");
              a1 = Integer.parseInt(br.readLine());
              a3 = a1;
              for(int i = 0; i <= 25; i++)
              {
                  System.out.println("----------------------------------------------------------------------");
                  System.out.println("Do you want to add another symptom?");
                  String x = br.readLine();
                  if(x.equalsIgnoreCase("yes")||x.equalsIgnoreCase("y"))
                  {
                      System.out.println("Go ahead.");
                      int pro = Integer.parseInt(br.readLine());             
                      a3 = a3 + pro;
                  }
                  else if(x.equalsIgnoreCase("no")||x.equalsIgnoreCase("n"))
                  {
                      break;
                  }
                  else
                  {
                      System.out.println("Sorry, wrong input. Please restart.....");
                      break;
                  }
              }
              System.out.println("********************************************************************************************************************************************************************************************");
              if(a3 == 16)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - INFLUENZA.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 10)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - DENGUE.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 20)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - MALARIA.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 59)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - PNEUMONIA.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 27)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - TYPHOID.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 13)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - AIDS.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 44)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - CHOLESTROL.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 28)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - TUBERCULOSIS.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 62)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - EBOLA.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 34)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - SWINE FLU.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else if(a3 == 37)
              {
                  System.out.println("The symptoms that you have entered result to the diagnosis of - JAUNDICE.\nPlease consult the closest pathological centre, and come back within a week.");
              }
              else
              {
                System.out.println("You do not seem to show the symptoms of any particular disease. From all that you have entered, you may have caught a viral infection.\nTo know more, consult our physician personally.");
              }
           }
           catch(Exception e)
           {
               System.out.println("Sorry. Wrong input.....");
               System.exit(0);                            
           }
         }
         else if(a2 == 2)
        {
            try
            {
                System.out.println("********************************************************************************************************************************************************************************************");
                System.out.println("Welcome back. Have you visited a pathology lab?");
                String qwerty = br.readLine();
                if(qwerty.equalsIgnoreCase("no")||qwerty.equalsIgnoreCase("n"))
               {
                   System.out.println("Then please do visit and come back again.");
               }
               else if(qwerty.equalsIgnoreCase("yes")||qwerty.equalsIgnoreCase("y"))
               {
                   System.out.println("Have you been tested Positive?");
                   String gm = br.readLine();
                   if(gm.equalsIgnoreCase("no")||gm.equalsIgnoreCase("n"))
                   {
                       System.out.println("Sit back and relax then! You probably have caught a viral. Consult a physician, exercise and drink lots of water. You should be fine.");
                       System.exit(0);
                   }
                   else if(gm.equalsIgnoreCase("yes")||gm.equalsIgnoreCase("y"))
                   {
                       System.out.println("Please enter the full name of the medical condition. No short-forms like TB, except AIDS.");
                       diseaseconfirm = br.readLine();
                   }
                   if(diseaseconfirm.equalsIgnoreCase("Influenza"))
                   {
                       System.out.println("No need to worry much. A simple treatment before you visit a physician can be given:-");
                       System.out.println("●Rest until the flu is fully resolved, especially if the illness has been severe....");
                       System.out.println("●Fluids — Drink enough fluids so that you do not become dehydrated.");
                       System.out.println("●Acetaminophen (such as Tylenol® and other brands) can relieve fever, headache, and muscle aches. Aspirin is not recommended.");
                       System.out.println("●Cough medicines are not usually helpful; cough usually resolves without treatment.");
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("Dengue"))
                   {
                       System.out.println("There is no specific medicine for the treatment of Dengue, but the following steps before visiting the physician can be taken:-");
                       System.out.println("●You should use pain relievers with acetaminophen and avoid medicines with aspirin.");
                       System.out.println("●You should also rest, drink plenty of fluids, and see your doctor.");
                       System.out.println("●Believe in yourself.... That's the most important thing!");
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("Malaria"))
                   {
                       System.out.println("Malaria can be treated with the following medical drugs:");
                       System.out.println("●Chloroquine (Aralen)               ");
                       System.out.println("●Quinine sulfate (Qualaquin)        ");
                       System.out.println("●Hydroxychloroquine (Plaquenil)     ");
                       System.out.println("●Mefloquine                         ");
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("Pneumonia"))
                   {
                       System.out.println("Pneumonia can be treated with consultation to a doctor. Meanwhile:");
                       System.out.println("●Drink plenty of fluids to help loosen secretions and bring up phlegm.");
                       System.out.println("●Get lots of rest. Have someone else do household chores.");
                       System.out.println("●Do not take cough medicines without first talking to your doctor. Cough medicines may make it harder for your body to cough up the extra sputum.");
                       System.out.println("●Control your fever with aspirin, nonsteroidal anti-inflammatory drugs (NSAIDs, such as ibuprofen or naproxen), or acetaminophen. DO NOT give aspirin to children.");
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("Typhoid"))
                   {
                       System.out.println("These drugs are the most commonly used for the treatment of typhoid:");
                       System.out.println("●Ciprofloxacin (Cipro): In the United States, doctors often prescribe this for nonpregnant adults.");
                       System.out.println("●Ceftriaxone (Rocephin): This is an injectable antibiotic."); 
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("AIDS"))
                   {
                       System.out.println("These things must be followed for AIDS affected patients:");
                       System.out.println("●There is only one wonderdrug known - Self confidence and determination. Losing them leads to weakening of the immune system.");
                       System.out.println("●It is a non-contact disease, so enjoy yourself socaily.");
                       System.out.println("●The key is not to panic and remember, many people have lived a normal life, even after contacting AIDS, to the fullest, upto old age!");
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("Cholestrol"))
                   {
                       System.out.println("Be wary. This medical condition cannot be taken lightly.");
                       System.out.println("●Eat and drink oil free foods. Eat oats and a lot fruits. Drink a lot of water(2 litres, atleast).");
                       System.out.println("●Maintaining (or losing) weight.");
                       System.out.println("●Exercise a lot and burn fats.");
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("Tuberculosis"))
                   {
                       System.out.println("For Tuberculosis, these drugs are usually prescribed:");
                       System.out.println("●Isoniazid                      ");
                       System.out.println("●Rifampin (Rifadin, Rimactane)  ");
                       System.out.println("●Ethambutol (Myambutol)         ");
                       System.out.println("●Pyrazinamide                   ");
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("Ebola"))
                   {
                       System.out.println("A physician is not completely authorized to say anything realted to this disease. Please contact a nearby government hospital.");
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("Swine flu"))
                   {
                       System.out.println("Many vaccines for swine flu are now available in government hospitals. Please contact one quiickly, and remember, it is communicable.");
                   }
                   else if(diseaseconfirm.equalsIgnoreCase("Jaundice"))
                   {
                       System.out.println("●Treatment may consist of expectant management (watchful waiting) at home with rest.");
                       System.out.println("●Medical treatment with intravenous fluids, medications, antibiotics, or blood transfusions may be required.");
                       System.out.println("●If a drug/toxin is the cause, these must be discontinued.");
                   }
               }
               flag++;
               System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________");
               System.out.println("Thank you and have a nice day. Please take care of your health as - 'Health is Wealth'.......");    
           }
           catch(Exception e)
           {
               System.out.println("Sorry. Wrong input.....");
               System.exit(0);               
           }
        }
        else if(a2 == 5)
        {
           try
           {
               System.out.println("********************************************************************************************************************************************************************************************");
               System.out.println("Welcome to the query section. We always appereciate queries from our patients.");
               System.out.println("Please enter your Email-ID in the box below. If you do not have one, enter 'n', and then type in your contact number:");
               String hud = br.readLine();
               if(hud.equalsIgnoreCase("n"))
               {
                   System.out.print("Enter your contact number(if telephone, begin with, '00'):");
                   String yo = br.readLine();
                   System.out.println("Please enter your query:");
                   String hhah = br.readLine();
                   System.out.println("We shall contact you, within 12 hours...........");
               }
               else
               {
                   System.out.println("Please enter your query:");
                   String hhah = br.readLine();
                   System.out.println("We shall do our best to help you, within 12 hours.........");
               }
           }
      
           catch(Exception e)
           {
               System.out.println("Sorry. Wrong input.....");
               System.exit(0);
           }
        }
        else
        {
           System.out.println("Sorry. Wrong input.....");
           System.exit(0);
        }
    }
    public void healthtip()
    {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Welcome to the HEALTH ZONE!!!! It is our custom to provide our patients free health tips....");
        int hflag2 = (int)(Math.random()*(10 - 1) + 1);
        if(hflag2 == 1)
        {
            System.out.println("Your tip is : \nPeople whose diets are rich in potassium may be less prone to high blood pressure. Besides reducing sodium and taking other heart-healthy steps, eat potassium-packed picks such as bananas, cantaloupe, and oranges.");
        }
        else if(hflag2 == 2)
        {
            System.out.println("Your tip is : \nAdding raw or lightly cooked garlic and onions to your meals may help keep you healthy this winter. Both foods appear to possess antiviral and antibacterial properties and are believed to boost immunity.");
        }
        else if(hflag2 == 3)
        {
            System.out.println("Your tip is : \nFor heel and arch pain, try stretching your foot by rolling it over a rolling pin or a bottle.");
        }
        else if(hflag2 == 4)
        {
            System.out.println("Your tip is : \nTame tension headaches by rubbing peppermint oil, Tiger Balm, or white flower oil into your temples. All three remedies contain menthol, which has analgesic properties.");
        }
        else if(hflag2 == 5)
        {
            System.out.println("Your tip is : \nIs your energy lagging? Though it may be the last thing you feel like doing when you're tired, exercise -- even a brisk walk -- can be more effective than a nap or cup of coffee at fighting fatigue.");
        }
        else if(hflag2 == 6)
        {
            System.out.println("Your tip is : \nCranberries contain a substance that appears to keep bacteria from sticking to the walls of the urinary tract and has been shown to help prevent UTIs.");
        }
        else if(hflag2 == 7)
        {
            System.out.println("Your tip is : \nTo fend off colds, washing your hands well and often is the best step you can take. Use plain soap and water and scrub for as long as it takes to sing 'Happy Birthday to You' twice!");
        }
        else if(hflag2 == 8)
        {
            System.out.println("Your tip is : \nFennel seeds are considered a carminative, a substance that helps relieve gas. Chew and then swallow about half a teaspoon of the seeds after meals.");
        }
        else if(hflag2 == 9)
        {
            System.out.println("Your tip is : \nFor healthy gums, put this green vegetable on your grocery list. It's an excellent source of vitamin C and provides calcium as well, both of which have been linked to lower rates of periodontal disease.");
        }
        else if(hflag2 == 10)
        {
            System.out.println("Your tip is : \nTo soothe a sore throat, try slippery elm, which can help ease pain by coating irritated tissue. Look for slippery elm lozenges and suck on them as needed.");
        }
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Thank you and have a nice day. Please take care of your health as - 'Health is Wealth'.......");    
    }
    public static void main(String[]args)throws IOException
    {
        Medicine me = new Medicine();
        me.Begin();
        if(flag == 1)
        {
            me.healthtip();
        }
    }
}