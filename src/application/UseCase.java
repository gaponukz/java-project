package src.application;

public interface UseCase<InputDTO, OutputDTO> {
    OutputDTO execute(InputDTO data);
}
