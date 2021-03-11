package shapes;

public interface Selectable {
   public boolean getSelected();
   public void setSelected( boolean x);
   public Shape contains( int x, int y);
}