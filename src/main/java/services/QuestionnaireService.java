package services;

import javax.enterprise.context.RequestScoped;


import model.Questionnaire;
import repositories.QuestionnaireRepository;

@RequestScoped
public class QuestionnaireService extends GenericEntityService<QuestionnaireRepository, Questionnaire>{

	@Override
	public Questionnaire updateEntity(long id, Questionnaire Entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
