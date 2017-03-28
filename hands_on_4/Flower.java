package hands_on_4;

public class Flower {
	
	private String fl_type;
	private double[] dim = new double[4];
	
	public Flower(String tp, String s_l, String s_w, String p_l, String p_w ){
		this.fl_type = tp;
		this.dim[0] = Double.parseDouble(s_l);
		this.dim[1] = Double.parseDouble(s_w);
		this.dim[2] = Double.parseDouble(p_l);
		this.dim[3] = Double.parseDouble(p_w);
	}
	
	public void print_name(){
		System.out.printf("Type:%s;\tSL:%.1f;\tSW:%.1f;\tPL:%.1f;\tPW:%.1f;\n",
				          this.fl_type,this.dim[0],this.dim[1],this.dim[2],this.dim[3]);
	}
}
