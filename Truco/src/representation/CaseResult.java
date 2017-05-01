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

	private java.lang.Boolean GanhouRodada;


	public java.lang.Boolean getGanhouRodada()
		{
			return GanhouRodada;
		}
	public void setGanhouRodada(java.lang.Boolean GanhouRodada33)
		{
			this.GanhouRodada = GanhouRodada33;
		}

	private java.lang.Boolean GanhouMao;


	public java.lang.Boolean getGanhouMao()
		{
			return GanhouMao;
		}
	public void setGanhouMao(java.lang.Boolean GanhouMao34)
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
