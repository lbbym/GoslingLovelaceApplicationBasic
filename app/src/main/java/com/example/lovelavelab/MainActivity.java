package com.example.lovelavelab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int orientation;
        orientation = getResources().getConfiguration().orientation;

        super.onCreate(savedInstanceState);

        if(orientation == 1) {
            setContentView(R.layout.activity_main);

            LinearLayout ada_content;
            ada_content = (LinearLayout) findViewById(R.id.ada_content);
            TextView adaText = new TextView(MainActivity.this);
            adaText.setText("Augusta Ada King, Countess of Lovelace (née Byron; 10 December 1815 – 27 November 1852) was an English mathematician and writer, chiefly known for her work on Charles Babbage's proposed mechanical general-purpose computer, the Analytical Engine. She was the first to recognise that the machine had applications beyond pure calculation, and published the first algorithm intended to be carried out by such a machine. As a result, she is sometimes regarded as the first to recognise the full potential of a \"computing machine\" and one of the first computer programmers.[2][3][4]\n" +
                    "\n" +
                    "Lovelace was the only legitimate child of the poet Lord Byron and his wife Anne Isabella \"Annabella\" Milbanke, Lady Wentworth.[5] All of Byron's other children were born out of wedlock to other women.[6] Byron separated from his wife a month after Ada was born and left England forever four months later. He commemorated the parting in a poem that begins, \"Is thy face like thy mother's my fair child! ADA! sole daughter of my house and heart?\".[7] He died of disease in the Greek War of Independence when Ada was eight years old. Her mother remained bitter and promoted Ada's interest in mathematics and logic in an effort to prevent her from developing her father's perceived insanity. Despite this, Ada remained interested in Byron and was, upon her eventual death, buried next to him at her request. She was often ill in her childhood. Ada married William King in 1835. King was made Earl of Lovelace in 1838, Ada thereby becoming Countess of Lovelace.\n" +
                    "\n" +
                    "Her educational and social exploits brought her into contact with scientists such as Andrew Crosse, Sir David Brewster, Charles Wheatstone, Michael Faraday and the author Charles Dickens, contacts which she used to further her education. Ada described her approach as \"poetical science\"[8] and herself as an \"Analyst (& Metaphysician)\".[9]\n" +
                    "\n" +
                    "When she was a teenager, her mathematical talents led her to a long working relationship and friendship with fellow British mathematician Charles Babbage, also known as \"the father of computers\", and in particular, Babbage's work on the Analytical Engine. Lovelace first met him in June 1833, through their mutual friend, and her private tutor, Mary Somerville.\n" +
                    "\n" +
                    "Between 1842 and 1843, Ada translated an article by Italian military engineer Luigi Menabrea on the calculating engine, supplementing it with an elaborate set of notes, simply called Notes. These notes contain what many consider to be the first computer program—that is, an algorithm designed to be carried out by a machine. Other historians reject this perspective and point out that Babbage's personal notes from the years 1836/1837 contain the first programs for the engine.[10] Lovelace's notes are important in the early history of computers. She also developed a vision of the capability of computers to go beyond mere calculating or number-crunching, while many others, including Babbage himself, focused only on those capabilities.[11] Her mindset of \"poetical science\" led her to ask questions about the Analytical Engine (as shown in her notes) examining how individuals and society relate to technology as a collaborative tool.[6]\n" +
                    "\n" +
                    "She died of uterine cancer in 1852 at the age of 36.");
            ada_content.addView(adaText);
        } else {
            setContentView(R.layout.activity_main_land);
            LinearLayout james_content;
            james_content = findViewById(R.id.james_content);
            TextView jamesText = new TextView(MainActivity.this);
            jamesText.setText("ames Gosling received a Bachelor of Science from the University of Calgary [4] and his M.A. and Ph.D. from Carnegie Mellon University, all in computer science.[2][5][6] He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate. He built a multi-processor version of Unix for a 16-way computer system[7] while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there.\n" +
                    "\n" +
                    "Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He is known as the father of the Java programming language.[8][9] He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware. He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,[8] citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.[10] He has since taken a very critical stance towards Oracle in interviews, noting that \"during the integration meetings between Sun and Oracle, where we were being grilled about the patent situation between Sun and Google, we could see the Oracle lawyer's eyes sparkle.\"[9] He clarified his position during the Oracle v Google trial over Android: \"While I have differences with Oracle, in this case, they are on the right. Google totally slimed Sun. We were all really disturbed, even Jonathan Schwartz; he just decided to put on a happy face and tried to turn lemons into lemonade, which annoyed a lot of folks on Sun.\"[11] However, he approved of the court's ruling that APIs should not be copyrightable.[12]\n" +
                    "\n" +
                    "In March 2011, Gosling left Oracle to work at Google.[13] Six months later, he followed his colleague Bill Vass and joined a startup called Liquid Robotics.[1] In late 2016, Liquid Robotics was acquired by Boeing.[14] Following the acquisition, Gosling left Liquid Robotics to work at Amazon Web Services as Distinguished Engineer in May 2017.[15]\n" +
                    "\n" +
                    "He is an adviser at the Scala company Lightbend,[16] Independent Director at Jelastic,[17] and Strategic Advisor for Eucalyptus,[18] and is a board member of DIRTT Environmental Solutions.[19]\n" +
                    "\n" +
                    "He is known for his love of proving \"the unknown\" and has noted that his favorite irrational number is √2. He has a framed picture of the first 1,000 digits of √2 in his office.[20]");
            james_content.addView(jamesText);
        }
    }

}
