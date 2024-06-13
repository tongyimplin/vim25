package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ClusterRecommendation;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterRecommendation", propOrder = {"key", "type", "time", "rating", "reason", "reasonText", "warningText", "warningDetails", "prerequisite", "action", "target"})
public class ClusterRecommendation extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar time;
  
  protected int rating;
  
  @XmlElement(required = true)
  protected String reason;
  
  @XmlElement(required = true)
  protected String reasonText;
  
  protected String warningText;
  
  protected LocalizableMessage warningDetails;
  
  protected List<String> prerequisite;
  
  protected List<ClusterAction> action;
  
  protected ManagedObjectReference target;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public XMLGregorianCalendar getTime() {
    return this.time;
  }
  
  public void setTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.time = paramXMLGregorianCalendar;
  }
  
  public int getRating() {
    return this.rating;
  }
  
  public void setRating(int paramInt) {
    this.rating = paramInt;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public String getReasonText() {
    return this.reasonText;
  }
  
  public void setReasonText(String paramString) {
    this.reasonText = paramString;
  }
  
  public String getWarningText() {
    return this.warningText;
  }
  
  public void setWarningText(String paramString) {
    this.warningText = paramString;
  }
  
  public LocalizableMessage getWarningDetails() {
    return this.warningDetails;
  }
  
  public void setWarningDetails(LocalizableMessage paramLocalizableMessage) {
    this.warningDetails = paramLocalizableMessage;
  }
  
  public List<String> getPrerequisite() {
    if (this.prerequisite == null)
      this.prerequisite = new ArrayList<>(); 
    return this.prerequisite;
  }
  
  public List<ClusterAction> getAction() {
    if (this.action == null)
      this.action = new ArrayList<>(); 
    return this.action;
  }
  
  public ManagedObjectReference getTarget() {
    return this.target;
  }
  
  public void setTarget(ManagedObjectReference paramManagedObjectReference) {
    this.target = paramManagedObjectReference;
  }
}
