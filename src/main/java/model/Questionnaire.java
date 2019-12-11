package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = Questionnaire.GET_ALL_QUESTIONNAIRES, query = "SELECT q FROM Questionnaire q")
@NamedQuery(name = Questionnaire.GET_ALL_QUESTIONNAIRES_IDS, query = "SELECT q.id FROM Questionnaire q")
@NamedQuery(name = Questionnaire.GET_QUESTIONNAIRES_COUNT, query = "SELECT COUNT(q) FROM Questionnaire q")
public class Questionnaire extends GenericEntity {

	private static final long serialVersionUID = 1L;

	public static final String GET_ALL_QUESTIONNAIRES = "Answer.getAllQuestionnaires";
	public static final String GET_ALL_QUESTIONNAIRES_IDS = "Answer.getAllQuestionnairesIds";
	public static final String GET_QUESTIONNAIRES_COUNT = "Answer.getQuestionnairesCount";
	
	@OneToMany
	private List<TrainingSession> trainingSessionsList = new ArrayList<TrainingSession>();
	@ManyToMany
	private List<Question> questionsList = new ArrayList<Question>();

}
