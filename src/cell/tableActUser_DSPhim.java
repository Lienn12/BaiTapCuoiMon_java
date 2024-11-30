package cell;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class tableActUser_DSPhim extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        pnlActUser_DSPhim action = new pnlActUser_DSPhim();
        if(!isSelected){
            action.setBackground(Color.WHITE);
        }else{
            action.setBackground(com.getBackground());
        }
        return action;
    }
}
