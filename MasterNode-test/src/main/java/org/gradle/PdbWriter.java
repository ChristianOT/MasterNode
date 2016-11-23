package org.gradle;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.util.List;

/**
 * Created by christian on 22/11/2016.
 */
@Service
public class PdbWriter implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> items) throws Exception {
        items.forEach(System.out::println);

        try {
            FileWriter writer = new FileWriter("complete_pdb_file_location.txt");       // output file containing the new filePaths
            items.forEach(pdb_FileLocation -> {
                try {
                    writer.write(pdb_FileLocation + "\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        // FOR DEVELOPMENT: Zip the files back up!
//        items.forEach(pdb_FileLocation ->{
//            List<String> oldFilePath = Arrays.asList(pdb_FileLocation.split("_completed"));
//            try {
//                Runtime.getRuntime().exec("gzip " + oldFilePath.get(0)+oldFilePath.get(oldFilePath.size()-1));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        });
    }
}
