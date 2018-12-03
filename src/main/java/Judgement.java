import Attributes.*;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Judgement {

    private int id;
    private CourtType courtType;
    private List<CourtCase> courtCases;
    private JudgementType judgmentType;
    private List<Judge> judges;
    private Source source;
    private List<String> courtReporters;
    private String decision;
    private String summary;
    private String textContent;
    private List<String> legalBases;
    private List<ReferencedRegulation> referencedRegulations;
    private List<String> keywords;
    private List<ReferencedCourtCase> referencedCourtCases;
    private String receiptDate;
    private String meansOfAppeal;
    private String judgmentResult;
    private List<String> lowerCourtJudgments;
    private PersonnelType personnelType; //Sąd najwyższy
    @SerializedName("division.id")
    private int divisionID;
    private List<Chamber> chambers;
    private List<DissentingOpinion> dissentingOpinions; //Trybunał konstytucyjny

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CourtType getCourtType() {
        return courtType;
    }

    public void setCourtType(CourtType courtType) {
        this.courtType = courtType;
    }

    public List<CourtCase> getCourtCases() {
        return courtCases;
    }

    public void setCourtCases(List<CourtCase> courtCases) {
        this.courtCases = courtCases;
    }

    public JudgementType getJudgmentType() {
        return judgmentType;
    }

    public void setJudgmentType(JudgementType judgmentType) {
        this.judgmentType = judgmentType;
    }

    public List<Judge> getJudges() {
        return judges;
    }

    public void setJudges(List<Judge> judges) {
        this.judges = judges;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public List<String> getCourtReporters() {
        return courtReporters;
    }

    public void setCourtReporters(List<String> courtReporters) {
        this.courtReporters = courtReporters;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public List<String> getLegalBases() {
        return legalBases;
    }

    public void setLegalBases(List<String> legalBases) {
        this.legalBases = legalBases;
    }

    public List<ReferencedRegulation> getReferencedRegulations() {
        return referencedRegulations;
    }

    public void setReferencedRegulations(List<ReferencedRegulation> referencedRegulations) {
        this.referencedRegulations = referencedRegulations;
    }

    public String getMeansOfAppeal() {
        return meansOfAppeal;
    }

    public void setMeansOfAppeal(String meansOfAppeal) {
        this.meansOfAppeal = meansOfAppeal;
    }
}
