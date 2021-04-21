package co.edu.eafit.bank.mapper;

import co.edu.eafit.bank.domain.UserType;
import co.edu.eafit.bank.domain.Users;
import co.edu.eafit.bank.dto.UsersDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public UsersDTO usersToUsersDTO(Users user) {
        if ( user == null ) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();

        usersDTO.setUstyId( userUserTypeUstyId( user ) );
        usersDTO.setEnable( user.getEnable() );
        usersDTO.setName( user.getName() );
        usersDTO.setToken( user.getToken() );
        usersDTO.setUserEmail( user.getUserEmail() );

        return usersDTO;
    }

    @Override
    public Users usersDTOToUsers(UsersDTO usersDTO) {
        if ( usersDTO == null ) {
            return null;
        }

        Users users = new Users();

        users.setUserType( usersDTOToUserType( usersDTO ) );
        users.setEnable( usersDTO.getEnable() );
        users.setName( usersDTO.getName() );
        users.setToken( usersDTO.getToken() );
        users.setUserEmail( usersDTO.getUserEmail() );

        return users;
    }

    @Override
    public List<UsersDTO> usersToUsersDTOs(List<Users> users) {
        if ( users == null ) {
            return null;
        }

        List<UsersDTO> list = new ArrayList<UsersDTO>( users.size() );
        for ( Users users1 : users ) {
            list.add( usersToUsersDTO( users1 ) );
        }

        return list;
    }

    @Override
    public List<Users> usersDTOsToUsers(List<UsersDTO> usersDTO) {
        if ( usersDTO == null ) {
            return null;
        }

        List<Users> list = new ArrayList<Users>( usersDTO.size() );
        for ( UsersDTO usersDTO1 : usersDTO ) {
            list.add( usersDTOToUsers( usersDTO1 ) );
        }

        return list;
    }

    private Integer userUserTypeUstyId(Users users) {
        if ( users == null ) {
            return null;
        }
        UserType userType = users.getUserType();
        if ( userType == null ) {
            return null;
        }
        Integer ustyId = userType.getUstyId();
        if ( ustyId == null ) {
            return null;
        }
        return ustyId;
    }

    protected UserType usersDTOToUserType(UsersDTO usersDTO) {
        if ( usersDTO == null ) {
            return null;
        }

        UserType userType = new UserType();

        userType.setUstyId( usersDTO.getUstyId() );

        return userType;
    }
}
