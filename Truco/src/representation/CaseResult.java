package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class CaseResult implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.Integer ResultID;


	public java.lang.Integer getResultID()
		{
			return ResultID;
		}
	public void setResultID(java.lang.Integer ResultID32)
		{
			this.ResultID = ResultID32;
		}

	private java.lang.Integer GanhouRodada;


	public java.lang.Integer getGanhouRodada()
		{
			return GanhouRodada;
		}
	public void setGanhouRodada(java.lang.Integer GanhouRodada33)
		{
			this.GanhouRodada = GanhouRodada33;
		}

	private java.lang.Integer GanhouMao;


	public java.lang.Integer getGanhouMao()
		{
			return GanhouMao;
		}
	public void setGanhouMao(java.lang.Integer GanhouMao34)
		{
			this.GanhouMao = GanhouMao34;
		}


	@Override
	public Attribute getIdAttribute()
		{
			return new Attribute("ResultID",this.getClass());
		} 

	public String toString()		{
			return "["+ GanhouMao + " , " + GanhouRodada + " , " + ResultID +"]";
		}

}
