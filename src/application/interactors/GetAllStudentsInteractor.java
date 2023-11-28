package src.application.interactors;

import java.util.List;

import src.entities.Student;
import src.application.UseCase;
import src.application.dto.GetAllStudentsInputDto;
import src.application.interfaces.GetAllAbleRepository;

public class GetAllStudentsInteractor implements UseCase<GetAllStudentsInputDto, List<Student>> {
    private GetAllAbleRepository repository;

    GetAllStudentsInteractor(GetAllAbleRepository repo) {
        repository = repo;
    }
    public List<Student> execute(GetAllStudentsInputDto data) {
        return repository.GetAll();
    }
}
