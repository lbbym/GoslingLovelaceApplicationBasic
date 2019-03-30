package com.example.lovelavelab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int orientation;
        orientation = getResources().getConfiguration().orientation;

        String mCurrentLanguage = Locale.getDefault().getLanguage();

        super.onCreate(savedInstanceState);

        if(orientation == 1) {
            setContentView(R.layout.activity_main);

            LinearLayout ada_content;
            ada_content = (LinearLayout) findViewById(R.id.ada_content);
            TextView adaText = new TextView(MainActivity.this);
            if(mCurrentLanguage != "zh") {
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
            } else if (mCurrentLanguage == "zh"){
                TextView name;
                name = findViewById(R.id.name_J);
                name.setText("愛達·勒芙蕾絲");
                adaText.setText("勒芙蕾絲伯爵夫人奧古斯塔·愛達·金·諾爾（Augusta Ada King-Noel, Countess of Lovelace，1815年12月10日－1852年11月27日），原姓拜倫（Byron），是一位英國數學家兼作家，代表作是她為查爾斯·巴貝奇的分析機——機械式通用計算機——所寫的作品。她是第一位主張計算機不只可以用來算數的人，也發表了第一段分析機用的演算法。因此，愛達被公認為史上第一位認識電腦完全潛能的人，也是史上第一位電腦程式設計師。[1][2][3]\n" +
                        "\n" +
                        "愛達·勒芙蕾絲是名詩人拜倫的唯一婚生子，母親為溫特沃斯女爵安妮·伊莎貝拉·米爾班奇（安娜貝拉）。[4]拜倫的其他子女都是和其他女人間的非婚生子。[5]愛達出生週月父母離異，四個月後父親離開英國，一去不歸。拜倫在詩中寫著：「我的嬌女，妳的容顏是否如母？愛達，我屋簷下、我心中唯一的女兒。」.[6]愛達八歲時，拜倫在希臘獨立戰爭中病死。愛達母親始終痛恨拜倫，致力栽培愛達的數學邏輯興趣，以免愛達陷入她眼中拜倫的瘋狂下場。但愛達終究很在意父親，過世時要求要葬在父親身旁。愛達童年多病。1835年愛達與威廉·金結婚，威廉·金於1838年受封勒芙蕾絲伯爵，她成為勒芙蕾絲伯爵夫人。\n" +
                        "\n" +
                        "藉著她的家庭與教育環境，她認識許多科學家，如安德魯·克羅斯、大衛·布儒斯特爵士、查爾斯·惠斯通、麥可·法拉第和作家狄更斯，跟著他們進修。愛達自稱是「分析家（兼形上學家）」[7]，並自稱在從事「詩意科學」[8]。\n" +
                        "\n" +
                        "十幾歲時，因著她的數學天份，愛達認識了後世譽為「電腦之父」的查爾斯·巴貝奇，並參與了巴貝奇的分析機。愛達在1833年透過家教瑪麗·薩默維爾的關係，認識了巴貝奇。\n" +
                        "\n" +
                        "在1842到1843年間，她翻譯了一篇義大利軍事工程師費德里科·路易吉闡述分析機的文章，並加上詳盡的筆記（篇名就叫筆記）。愛達的筆記裡，包含了公認的第一段電腦程式—一段分析機用的演算法。愛達的筆記對早期電腦發展史非常重要。此外，當巴貝奇等同時代學者，只著眼於電腦的數學運算力時，愛達已經預見了電腦廣泛應用的未來。[9]她在筆記中以她獨有的「詩意科學」思考分析機，研究個人和社會，如何透過科技協同工作。[5]\n" +
                        "\n" +
                        "愛達在1852年因子宮癌逝世，享年36歲。");
            }
            ada_content.addView(adaText);
        } else {
            setContentView(R.layout.activity_main_land);
            LinearLayout james_content;
            james_content = findViewById(R.id.james_content);
            TextView jamesText = new TextView(MainActivity.this);
            if(mCurrentLanguage != "zh") {
                jamesText.setText("ames Gosling received a Bachelor of Science from the University of Calgary [4] and his M.A. and Ph.D. from Carnegie Mellon University, all in computer science.[2][5][6] He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate. He built a multi-processor version of Unix for a 16-way computer system[7] while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there.\n" +
                        "\n" +
                        "Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He is known as the father of the Java programming language.[8][9] He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware. He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,[8] citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.[10] He has since taken a very critical stance towards Oracle in interviews, noting that \"during the integration meetings between Sun and Oracle, where we were being grilled about the patent situation between Sun and Google, we could see the Oracle lawyer's eyes sparkle.\"[9] He clarified his position during the Oracle v Google trial over Android: \"While I have differences with Oracle, in this case, they are on the right. Google totally slimed Sun. We were all really disturbed, even Jonathan Schwartz; he just decided to put on a happy face and tried to turn lemons into lemonade, which annoyed a lot of folks on Sun.\"[11] However, he approved of the court's ruling that APIs should not be copyrightable.[12]\n" +
                        "\n" +
                        "In March 2011, Gosling left Oracle to work at Google.[13] Six months later, he followed his colleague Bill Vass and joined a startup called Liquid Robotics.[1] In late 2016, Liquid Robotics was acquired by Boeing.[14] Following the acquisition, Gosling left Liquid Robotics to work at Amazon Web Services as Distinguished Engineer in May 2017.[15]\n" +
                        "\n" +
                        "He is an adviser at the Scala company Lightbend,[16] Independent Director at Jelastic,[17] and Strategic Advisor for Eucalyptus,[18] and is a board member of DIRTT Environmental Solutions.[19]\n" +
                        "\n" +
                        "He is known for his love of proving \"the unknown\" and has noted that his favorite irrational number is √2. He has a framed picture of the first 1,000 digits of √2 in his office.[20]");
            } else if(mCurrentLanguage == "zh") {
                TextView name_j;
                name_j = findViewById(R.id.name_J);
                name_j.setText("詹姆斯·高斯林");
                jamesText.setText("在他12歲的時候，他已能設計電子遊戲機，幫忙鄰居修理收割機。大學時期在天文系擔任程式開發工讀生，1977年獲得了加拿大卡爾加里大學計算機科學學士學位。1981年开发在Unix上运行的Emacs类编辑器Gosling Emacs（以C语言编写，使用Mocklisp作为扩展语言）。1983年獲得了美國卡內基梅隆大學計算機科學博士學位，博士論文的題目是：\"The Algebraic Manipulation of Constraints\"。畢業後到IBM工作，設計IBM第一代工作站NeWS系統，但不受重視。後來轉至Sun公司。1990年，與Patrick Naughton和Mike Sheridan等人合作“绿色计划”，後來發展一套语言叫做“Oak”，後改名為Java。1994年底，James Gosling在硅谷召开的“技术、教育和设计大会”上展示Java程式。2000年，Java成为世界上最流行的电脑语言。\n" +
                        "\n" +
                        "2009年四月，Sun被甲骨文公司併購。詹姆斯於2010年四月時宣布从甲骨文公司離職[2]。\n" +
                        "\n" +
                        "2011年3月29日，高斯林在個人博客上宣布將加入Google[3]。\n" +
                        "\n" +
                        "2011年8月30日，僅僅加入Google數月之後的高斯林就在個人博客上宣佈離開Google，加盟一家從事海洋機器人研究的創業公司Liquid Robotics[1]，擔任首席軟體架構師。\n" +
                        "\n" +
                        "在2011年5月建立的Scala公司Typesafe Inc.，高斯林被列为公司顾问。[4]");
            }
            james_content.addView(jamesText);
        }
    }

}
