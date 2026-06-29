public interface UserRepository {
    String findById(int id);
    void save(String name);
}
