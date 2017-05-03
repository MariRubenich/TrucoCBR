package cbr;

import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.exception.InitializingException;
import jcolibri.method.retrieve.NNretrieval.NNConfig;

import javax.annotation.Generated;
import representation.CaseDescription;
import representation.CaseResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.selection.SelectCases;
import java.util.Collection;
import trucointerface.telaprincipal;

public class CBRApplication implements StandardCBRApplication {

	@Generated(value = { "ColibriStudio" })
	Connector connector;
	
	@Generated(value = { "ColibriStudio" })
	CBRCaseBase casebase;



	//******************************************************************/
	// Configuration
	//******************************************************************/

	@Override
	public void configure() throws ExecutionException {
		try{
			configureConnector();
			configureCaseBase();
		} catch (Exception e){
			throw new ExecutionException(e);
		}
	}

	/** Configures the connector */
	@Generated(value = { "CS-PTConector" })	
	private void configureConnector() throws InitializingException{
		connector = new jcolibri.connector.PlainTextConnector();
		connector.initFromXMLfile(jcolibri.util.FileIO
				.findFile("config/plainTextConnectorConfig.xml"));
	}

	/** Configures the case base */
	@Generated(value = { "CS-CaseManager" })	
	private void configureCaseBase() throws InitializingException{
		casebase = new jcolibri.casebase.LinearCaseBase();
	}

	//******************************************************************/
	// Similarity
	//******************************************************************/
	
	/** Configures the similarity */
	@Generated(value = { "CS-Similarity" })	
	private NNConfig getSimilarityConfig() {
		NNConfig simConfig = new NNConfig();
		simConfig
				.setDescriptionSimFunction(new jcolibri.method.retrieve.NNretrieval.similarity.global.Average());
		Attribute attribute0 = new Attribute("J1Cartas", CaseDescription.class);
		simConfig
				.addMapping(
						attribute0,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute0, 0.00);
		Attribute attribute1 = new Attribute("J1Carta1", CaseDescription.class);
		simConfig
				.addMapping(
						attribute1,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute1, 0.80);
		Attribute attribute2 = new Attribute("J1Carta2", CaseDescription.class);
		simConfig
				.addMapping(
						attribute2,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute2, 0.80);
		Attribute attribute3 = new Attribute("J1Carta3", CaseDescription.class);
		simConfig
				.addMapping(
						attribute3,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute3, 0.80);
		Attribute attribute4 = new Attribute("J2Cartas", CaseDescription.class);
		simConfig
				.addMapping(
						attribute4,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute4, 0.00);
		Attribute attribute5 = new Attribute("J2Carta1", CaseDescription.class);
		simConfig
				.addMapping(
						attribute5,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute5, 0.80);
		Attribute attribute6 = new Attribute("J2Carta2", CaseDescription.class);
		simConfig
				.addMapping(
						attribute6,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute6, 0.80);
		Attribute attribute7 = new Attribute("J2Carta3", CaseDescription.class);
		simConfig
				.addMapping(
						attribute7,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute7, 0.80);
		Attribute attribute8 = new Attribute("J1CartaJogada",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute8,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute8, 0.00);
		Attribute attribute9 = new Attribute("J1CartaJogadaInt",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute9,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute9, 1.00);
		Attribute attribute10 = new Attribute("J2CartaJogada",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute10,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute10, 0.00);
		Attribute attribute11 = new Attribute("J2CartaJogadaInt",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute11,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute11, 1.00);
		Attribute attribute12 = new Attribute("Truco", CaseDescription.class);
		simConfig
				.addMapping(
						attribute12,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute12, 1.00);
		Attribute attribute13 = new Attribute("TrucoPediu",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute13,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute13, 1.00);
		Attribute attribute14 = new Attribute("TrucoAceito",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute14,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute14, 1.00);
		Attribute attribute15 = new Attribute("Retruco", CaseDescription.class);
		simConfig
				.addMapping(
						attribute15,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute15, 1.00);
		Attribute attribute16 = new Attribute("RetrucoAceito",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute16,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute16, 1.00);
		Attribute attribute17 = new Attribute("Envido", CaseDescription.class);
		simConfig
				.addMapping(
						attribute17,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute17, 1.00);
		Attribute attribute18 = new Attribute("EnvidoAceito",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute18,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute18, 1.00);
		Attribute attribute19 = new Attribute("EnvidoGanho",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute19,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute19, 1.00);
		Attribute attribute20 = new Attribute("Flor", CaseDescription.class);
		simConfig
				.addMapping(
						attribute20,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute20, 1.00);
		Attribute attribute21 = new Attribute("FlorGanho",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute21,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute21, 1.00);
		Attribute attribute22 = new Attribute("NivelCarta",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute22,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute22, 0.75);
		Attribute attribute23 = new Attribute("NivelTruco",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute23,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute23, 1.00);
		Attribute attribute24 = new Attribute("NivelEnvido",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute24,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute24, 1.00);
		Attribute attribute25 = new Attribute("NivelFlor",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute25,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute25, 1.00);
		Attribute attribute26 = new Attribute("J1Pontos", CaseDescription.class);
		simConfig
				.addMapping(
						attribute26,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute26, 0.00);
		Attribute attribute27 = new Attribute("J2Pontos", CaseDescription.class);
		simConfig
				.addMapping(
						attribute27,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute27, 0.00);
		Attribute attribute28 = new Attribute("Rodada", CaseDescription.class);
		simConfig
				.addMapping(
						attribute28,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute28, 1.00);
		Attribute attribute29 = new Attribute("EnvidoPediu",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute29,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute29, 1.00);
                Attribute attribute30 = new Attribute("FlorPediu",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute30,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute30, 1.00);
		return simConfig;
	}

	//******************************************************************/
	// Methods
	//******************************************************************/
	

	@Generated(value = { "ColibriStudio" })
	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		casebase.init(connector);
		return casebase;
	}
		
	@Generated(value = { "ColibriStudio" })	
	@Override
	public void cycle(CBRQuery query) throws ExecutionException {
		NNConfig simConfig = getSimilarityConfig();
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(
				casebase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 5);
		System.out.println("Retrieved cases:");
		for (RetrievalResult nse : eval)
			System.out.println(nse);
	}

	@Generated(value = { "ColibriStudio" })
	@Override
	public void postCycle() throws ExecutionException {
		connector.close();
	}
        

	/**
	 * Main method
	 */
	@Generated(value = { "ColibriStudio" })
	public static void main(String[] args) {
		CBRApplication cbrApp = new CBRApplication();
		try {
			cbrApp.configure();
			cbrApp.preCycle();
			CBRQuery query = new CBRQuery();
			query.setDescription(new CaseDescription());
			//query = jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod.obtainQueryWithoutInitialValues(query, null, null);			
			//jcolibri.util.gui.DisplayCasesTableMethod.displayCasesInTableBasic(cbrApp.casebase.getCases());
                        //CBRTruco.pedirTruco(cbrApp.getSimilarityConfig(), cbrApp.casebase, 1,7,3,3,7,3,3);
                        telaprincipal tela = new telaprincipal(cbrApp.getSimilarityConfig(), cbrApp.casebase);
                        tela.setVisible(true);
			//cbrApp.cycle(query);
			cbrApp.postCycle();
			//CBRCaseBase caseBase = cbrApp.preCycle();
			
			//for(CBRCase c: caseBase.getCases())
			//	System.out.println(c);
			
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}
}
