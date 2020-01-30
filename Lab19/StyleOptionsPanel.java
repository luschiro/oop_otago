//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
   private JLabel saying;
   private JCheckBox bold, italic, courier, tnr, helvetica;
   private int style = Font.PLAIN;
   private String typeFace = "Helvetica";

   //-----------------------------------------------------------------
   //  Sets up a panel with a label and some check boxes that
   //  control the style of the label's font.
   //-----------------------------------------------------------------
   public StyleOptionsPanel()
   {
      saying = new JLabel ("Say it with style!");
      saying.setFont (new Font (typeFace, style, 20));
      
      setLayout (new GridLayout (6, 1));

      bold = new JCheckBox ("Bold");
      bold.setBackground (Color.cyan);
      italic = new JCheckBox ("Italic");
      italic.setBackground (Color.cyan);
      courier = new JCheckBox("Courier");
      courier.setBackground (Color.cyan);
      tnr = new JCheckBox("Times New Roman");
      tnr.setBackground (Color.cyan);
      helvetica = new JCheckBox("Helvetica");
      helvetica.setBackground (Color.cyan);
      
      

      StyleListener listener = new StyleListener();
      bold.addItemListener (listener);
      italic.addItemListener (listener);
      courier.addItemListener (listener);
      tnr.addItemListener (listener);
      helvetica.addItemListener (listener);
      

      add (saying);
      add (bold);
      add (italic);
      add (courier);
      add (tnr);
      add (helvetica);

      setBackground (Color.cyan);
      setPreferredSize (new Dimension(300, 100));
   }

   //*****************************************************************
   //  Represents the listener for both check boxes.
   //*****************************************************************
   private class StyleListener implements ItemListener
   {
      //--------------------------------------------------------------
      //  Updates the style of the label font style.
      //--------------------------------------------------------------
      public void itemStateChanged (ItemEvent event)
      {
         style = Font.PLAIN;
         typeFace = "Helvetica";

         if (bold.isSelected())
            style = Font.BOLD;

         if (italic.isSelected())
            style += Font.ITALIC;
         
         if (courier.isSelected())
            typeFace = "Courier";
         
         if (tnr.isSelected())
            typeFace = " Times New Roman";
         
         if (helvetica.isSelected())
            typeFace = "Helvetica";

         saying.setFont (new Font (typeFace, style, 20));
      }
   }
}
