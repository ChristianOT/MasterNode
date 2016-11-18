package org.gradle;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by christian on 17/11/2016.
 */
public class Processor implements ItemProcessor<String,String> {

    @Override
    public String process(String filePath) throws Exception {
        Process p = Runtime.getRuntime().exec("gunzip "+filePath);
        p.waitFor();
        String newPath = filePath.split(".gz")[0];
//        p = Runtime.getRuntime().exec("phenix.python ~/MyProject/qr-core/tests/tst_07 --file="+newPath);
//        p.waitFor();
        return newPath;
    }
}
