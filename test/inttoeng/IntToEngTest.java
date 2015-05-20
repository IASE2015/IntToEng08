package inttoeng;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntToEngTest {

		@Test
		public void あ０から９まで(){
				IntToEng ite= new IntToEng();
				String expected0="zero";
				String expected1="one";
				String expected2="two";
				String expected3="three";
				String expected4="four";
				String expected5="five";
				String expected6="six";
				String expected7="seven";
				String expected8="eight";
				String expected9="nine";
				
				
				String actual0=ite.number(0);
				/*String actual1=ite.translateEng(1);
				String actual2=ite.translateEng(2);
				String actual3=ite.translateEng(3);
				String actual4=ite.translateEng(4);
				String actual5=ite.translateEng(5);
				String actual6=ite.translateEng(6);
				String actual7=ite.translateEng(7);
				String actual8=ite.translateEng(8);
				String actual9=ite.translateEng(9);*/
				
				
				assertEquals(actual0,expected0);
				/*assertEquals(actual1,expected1);
				assertEquals(actual2,expected2);
				assertEquals(actual3,expected3);
				assertEquals(actual4,expected4);
				assertEquals(actual5,expected5);
				assertEquals(actual6,expected6);
				assertEquals(actual7,expected7);
				assertEquals(actual8,expected8);
				assertEquals(actual9,expected9);*/
				
		}
		@Test
		public void あ10から19まで(){
			IntToEng ite= new IntToEng();
			String expected10="ten";
			String expected11="eleven";
			String expected12="twelve";
			String expected13="thirteen";
			String expected14="fourteen";
			String expected15="fifteen";
			String expected16="sixteen";
			String expected17="seventeen";
			String expected18="eighteen";
			String expected19="nineteen";
			
			
			String actual10=ite.translateEng(10);
			String actual11=ite.translateEng(11);
			String actual12=ite.translateEng(12);
			String actual13=ite.translateEng(13);
			String actual14=ite.translateEng(14);
			String actual15=ite.translateEng(15);
			String actual16=ite.translateEng(16);
			String actual17=ite.translateEng(17);
			String actual18=ite.translateEng(18);
			String actual19=ite.translateEng(19);
			
			
			assertEquals(actual10,expected10);
			assertEquals(actual11,expected11);
			assertEquals(actual12,expected12);
			assertEquals(actual13,expected13);
			assertEquals(actual14,expected14);
			assertEquals(actual15,expected15);
			assertEquals(actual16,expected16);
			assertEquals(actual17,expected17);
			assertEquals(actual18,expected18);
			assertEquals(actual19,expected19);
		}
		
		@Test
		public void あ2０から99まで(){
			IntToEng ite= new IntToEng();
			String expected20="twenty";
			String expected21="twentyone";
			String expected22="twentytwo";
			String expected30="thirty";
			String expected44="fortyfour";
			String expected90="ninety";
			String expected98="ninetyeight";
			String expected99="ninetynine";
		
					
			String actual20=ite.translateEng(20);
			String actual21=ite.translateEng(21);
			String actual22=ite.translateEng(22);
			String actual30=ite.translateEng(30);
			String actual44=ite.translateEng(44);
			String actual90=ite.translateEng(90);
			String actual98=ite.translateEng(98);
			String actual99=ite.translateEng(99);
			
			assertEquals(actual20,expected20);
			assertEquals(actual21,expected21);
			assertEquals(actual22,expected22);
			assertEquals(actual30,expected30);
			assertEquals(actual44,expected44);
			assertEquals(actual90,expected90);
			assertEquals(actual98,expected98);
			assertEquals(actual99,expected99);
		}
	}