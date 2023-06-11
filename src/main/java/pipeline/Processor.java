package pipeline;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.values.PCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pipeline.utils.CommonUtils;

public class Processor {

    private static final Logger logger = LoggerFactory.getLogger(Processor.class);
    public static void main(String[] args) {

        final String INPUT_FILE_NAME = CommonUtils.getInputFilePath("pipeline-input");
        final String OUTPUT_FILE_NAME = CommonUtils.getOutputFilePath("pipeline-output");

        logger.info("Pipeline Starting........");
        Pipeline pipeline = Pipeline.create();
        PCollection<String> file = pipeline.apply("ReadExcelFile", TextIO.read().from(INPUT_FILE_NAME));
        file.apply("WriteFile", TextIO.write().to(OUTPUT_FILE_NAME).withNumShards(1).withSuffix(".csv"));
        pipeline.run();
        logger.info("Pipeline Completed........");

    }
}
