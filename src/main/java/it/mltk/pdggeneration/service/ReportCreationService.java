package it.mltk.pdggeneration.service;

import it.mltk.pdggeneration.dto.ReportDto;
import it.mltk.pdggeneration.dto.TableDto;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ReportCreationService {

    @Description("Dummy method to generate static data, to test generation of different structures")
    public ReportDto createReport() {
        ReportDto report = new ReportDto("Report 1", "Heavens is not the popular awareness of the believer. Going to the home doesn’t respect blessing anymore than gaining creates popular relativity. Who can experience the career and trust of a follower if he has the separate moonlight of the yogi? Samadhi yearns when you understand with ascension.", null);
        Collection<TableDto> table = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TableDto t = new TableDto(String.valueOf(i), "Name" + i, "Value" + i, "Where is the real bucaneer?");
            table.add(t);
        }
        report.setTable(table);
        return report;
    }
}
