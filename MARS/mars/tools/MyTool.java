   package mars.tools;
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import mars.*;

	
/*
Copyright (c) 2003-2006,  Pete Sanderson and Kenneth Vollmar

Developed by Pete Sanderson (psanderson@otterbein.edu)
and Kenneth Vollmar (kenvollmar@missouristate.edu)

Permission is hereby granted, free of charge, to any person obtaining 
a copy of this software and associated documentation files (the 
"Software"), to deal in the Software without restriction, including 
without limitation the rights to use, copy, modify, merge, publish, 
distribute, sublicense, and/or sell copies of the Software, and to 
permit persons to whom the Software is furnished to do so, subject 
to the following conditions:

The above copyright notice and this permission notice shall be 
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF 
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR 
ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION 
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

(MIT license, http://www.opensource.org/licenses/mit-license.html)
 */
	
   /**
	 * The "hello world" of MarsTools!
	 */
    public class MyTool extends AbstractMarsToolAndApplication {
   
      private static String heading =  "My First Tool";
		private static String version = " Version 1.0 (Nat�lio)";
			private static String name = "MyTool";
   	         	
   	/**
   	 * Simple constructor, likely used to run a stand-alone memory reference visualizer.
   	 * @param title String containing title for title bar
   	 * @param heading String containing text for heading shown in upper part of window.
   	 */
       public MyTool(String title, String heading) {
         super(title,heading);
      }
   	 
   	 /**
   	  *  Simple constructor, likely used by the MARS Tools menu mechanism
   	  */
       public MyTool() {
         super (heading+", "+version, heading);
      }
   		 
   		 
   	/**
   	 * Main provided for pure stand-alone use.  Recommended stand-alone use is to write a 
   	 * driver program that instantiates a MemoryReferenceVisualization object then invokes its go() method.
   	 * "stand-alone" means it is not invoked from the MARS Tools menu.  "Pure" means there
   	 * is no driver program to invoke the application.
   	 */
       public static void main(String[] args) {
         new MyTool(heading+", "+version,heading).go();
      }
   	
   
       /**
   	  *  Required method to return Tool name.  
   	  *  @return  Tool name.  MARS will display this in menu item.
   	  */
       public String getName() {
         return "MyTool";
      }
   	
      /**
   	 *  Implementation of the inherited abstract method to build the main 
   	 *  display area of the GUI.  It will be placed in the CENTER area of a 
   	 *  BorderLayout.  The title is in the NORTH area, and the controls are 
   	 *  in the SOUTH area.
   	 */
       protected JComponent buildMainDisplayArea() {
         JTextArea message = new JTextArea();
         message.setEditable(false);
         message.setLineWrap(true);
         message.setWrapStyleWord(true);
         message.setFont(new Font("Ariel",Font.PLAIN,12));
         message.setText("Essa ferramenta foi criada para fins did�ticos no curso de SO da UFERSA");
				message.setCaretPosition(0); // Assure first line is visible and at top of scroll pane.
         return new JScrollPane(message);
      }
   	
   }