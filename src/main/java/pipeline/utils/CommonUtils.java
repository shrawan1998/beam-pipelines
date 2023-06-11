package pipeline.utils;

import pipeline.constants.ProcessorConstants;

public class CommonUtils {

    final static String FILE_SUFFIX = ProcessorConstants.FILE_SUFFIX;
    
    public static String getInputFilePath(String fileName) {
        if (fileName == null || fileName.isEmpty())
            return ProcessorConstants.INPUT_FILE_PATH + ProcessorConstants.INPUT_FILE_NAME + FILE_SUFFIX;
        else
            return ProcessorConstants.INPUT_FILE_PATH + fileName + FILE_SUFFIX;
    }
    
    public static String getOutputFilePath(String fileName) {
        if (fileName == null || fileName.isEmpty())
            return ProcessorConstants.OUTPUT_FILE_PATH + ProcessorConstants.OUTPUT_FILE_NAME + FILE_SUFFIX;
        else
            return ProcessorConstants.OUTPUT_FILE_PATH + fileName + FILE_SUFFIX;
    }

}
