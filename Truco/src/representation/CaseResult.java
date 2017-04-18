package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class CaseResult implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.Boolean WinJogo;


	public java.lang.Boolean getWinJogo()
		{
			return WinJogo;
		}
	public void setWinJogo(java.lang.Boolean WinJogo29)
		{
			this.WinJogo = WinJogo29;
		}

	private java.lang.Boolean WinMao;


	public java.lang.Boolean getWinMao()
		{
			return WinMao;
		}
	public void setWinMao(java.lang.Boolean WinMao30)
		{
			this.WinMao = WinMao30;
		}

	private java.lang.Boolean WinRodada;


	public java.lang.Boolean getWinRodada()
		{
			return WinRodada;
		}
	public void setWinRodada(java.lang.Boolean WinRodada31)
		{
			this.WinRodada = WinRodada31;
		}

	private java.lang.Integer ResultID;


	public java.lang.Integer getResultID()
		{
			return ResultID;
		}
	public void setResultID(java.lang.Integer ResultID32)
		{
			this.ResultID = ResultID32;
		}


	@Override
	public Attribute getIdAttribute()
		{
			return new Attribute("ResultID",this.getClass());
		} 

	public String toString()		{
			return "["+ WinRodada + " , " + WinJogo + " , " + ResultID + " , " + WinMao +"]";
		}

}
