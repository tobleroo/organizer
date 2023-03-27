package com.tjdev.organizer;

import com.tjdev.organizer.model.MyUser;
import com.tjdev.organizer.model.Task;
import org.junit.jupiter.api.Test;

import java.util.List;

//public class StreamsTests {

//    private List<Task> taskListOne = List.of(new Task("actOne","description is here", 20),
//            new Task("actTwo","another description", 35));
//    private List<Task> taskListTwo = List.of(new Task("secondActOne","boil the bag", 15),
//            new Task("secondActTwo","clean the pipe", 45));
//    private TaskCategories taskCategoriesOne = new TaskCategories("taskListOne");
//    private TaskCategories taskCategoriesTwo = new TaskCategories("taskListTwo");
//    private MyUser demoUser = new MyUser("user", "password");
//
//    @Test
//    void createListFromStream(){
//
//        taskCategoriesOne.setListOfTasks(taskListOne);
//        taskCategoriesTwo.setListOfTasks(taskListTwo);
//        demoUser.setTaskCategories(List.of(taskCategoriesOne, taskCategoriesTwo));
//
//        List<TaskCategories> demoList = demoUser.getTaskCategories().stream()
//                .toList();
//
//        System.out.println(demoList);
//    }
//
//    @Test
//    void filterWithStream(){
//        taskCategoriesOne.setListOfTasks(taskListOne);
//        taskCategoriesTwo.setListOfTasks(taskListTwo);
//        demoUser.setTaskCategories(List.of(taskCategoriesOne, taskCategoriesTwo));
//
//        //get only one of the nested lists. based on name of list
//        List<TaskCategories> demoFiltered = demoUser.getTaskCategories().stream()
//                .filter(category -> category.getTaskCategoryName().equals("taskListTwo"))
//                .findFirst()
//                        .stream().toList();
//
//        System.out.println(demoFiltered);
//    }
//
//    @Test
//    void mapToGetListSize(){
//        taskCategoriesOne.setListOfTasks(taskListOne);
//        taskCategoriesTwo.setListOfTasks(taskListTwo);
//        demoUser.setTaskCategories(List.of(taskCategoriesOne, taskCategoriesTwo));
//
//        List<Integer> listSizes = demoUser.getTaskCategories().stream()
//                .map(list -> list.getListOfTasks().size())
//                .toList();
//
//        System.out.println(listSizes);
//    }
//
//    @Test
//    void flatmapToGetList(){
//        taskCategoriesOne.setListOfTasks(taskListOne);
//        taskCategoriesTwo.setListOfTasks(taskListTwo);
//        demoUser.setTaskCategories(List.of(taskCategoriesOne, taskCategoriesTwo));
//
//        //get all tasks from all different categories and add all to a new list
//        List<Task> demo = demoUser.getTaskCategories().stream()
//                .flatMap(task -> task.getListOfTasks().stream())
//                .distinct()
//                .toList();
//
//        System.out.println(demo);
//    }
//
//    @Test
//    void sortAllListsIndividually(){
//        taskCategoriesOne.setListOfTasks(taskListOne);
//        taskCategoriesTwo.setListOfTasks(taskListTwo);
//        demoUser.setTaskCategories(List.of(taskCategoriesOne, taskCategoriesTwo));
//
//        List<TaskCategories> demo = demoUser.getTaskCategories().stream()
//                .map(list -> list.getListOfTasks().stream().sorted().toList())
//                        .toList();
//
//        System.out.println(demo);
//    }
//}
