package com.ironhack.tfdtheorycraftbuild.Loader;


import com.ironhack.tfdtheorycraftbuild.service.RoleService;
import com.ironhack.tfdtheorycraftbuild.service.UserService;
import com.ironhack.tfdtheorycraftbuild.service.BuildsService;
import com.ironhack.tfdtheorycraftbuild.service.CharactersService;
import com.ironhack.tfdtheorycraftbuild.service.ModsService;
import com.ironhack.tfdtheorycraftbuild.service.SkillsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CharactersService charactersService;
    private final SkillsService skillsService;
    private final UserService userService;
    private final RoleService roleService;
    private final ModsService modsService;
    private final BuildsService buildsService;

    public DataLoader(CharactersService charactersService, SkillsService skillsService, UserService userService, RoleService roleService, ModsService modsService, BuildsService buildsService) {
        this.charactersService = charactersService;
        this.skillsService = skillsService;
        this.userService = userService;
        this.roleService = roleService;
        this.modsService = modsService;
        this.buildsService = buildsService;
    }

    @Override
    public void run(String... args) throws Exception {
//        //Skills
//        skillsService.addSkill("Close Call", "Upon receiving fatal damage, gains 'Close Call'. While 'Close Call' is active, Grants DMG Immunity and Immobilization. When 'Close Call' ends, recovers HP proportional to own Max HP", 34, 600, 32, 0.50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
//        skillsService.addSkill("Grenade Throw", "Throw a grenade forward, dealing Burst damage.", 34, 6,35,35,30, 5.854,6, 6.2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
//        skillsService.addSkill("Overclock", "Gains 'Overclock'. Inflicts 'Burn' on enemies damaged by 'Grenade Throw' or 'Overkill'. Burn deals continuous damage for a certain period of time.", 34, 20, 35, 24, 7, 20, 11, 0.20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
//        skillsService.addSkill("Traction Grenade", "Throws a 'Traction Grenade' forward to inflict 'Towed' on enemies within range", 34, 25, 35, 45, 6, 9, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
//        skillsService.addSkill("Overkill", "Equips a 'Unique Weapon'. While the Unique Weapon is equipped, MP is continuously consumed. When MP runs out, the weapon is unequipped. Enemies hit by 'Unique Weapon' bullets take Burst DMG. The impact point of the 'Unique Weapon' creates a damage zone, dealing continuous damage.", 34, 80, 35, 40, 38, 20, 30, 27.603, 30, 0.438, 7, 8, 0, 0, 0, 0, 0, 0, 0, 0);
//
//        //Characters
//        charactersService.addCharacter("Lepic", 1, 2, 3, 4, 5, 1373, 243, 413, 2441, 13, 11, 11, 11, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0.30, 11724.62, 0, 0, 0.03, 0, 0, 0, 0, 0, 100, 0, 0);
//
//        //builds
//        //buildsService.addBuild("LepicBuild",1, 65, 65, 1,2,3,4,5,6,7,8);
//
//
//        //Roles
//        roleService.save(new Role("ROLE_USER"));
//        roleService.save(new Role("ROLE_ADMIN"));
//
//        //Users
//        userService.saveUser(new User("Sactum", "Hrea", "2222"));
//
//        //Add Roles to Users
//        roleService.addRoleToUser("Hrea", "ROLE_USER");
//        roleService.addRoleToUser("Hrea", "ROLE_ADMIN");
    }
}