package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestAuthAliasInfo;
import com.vmware.vim25.GuestAuthSubject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAuthAliasInfo", propOrder = {"subject", "comment"})
public class GuestAuthAliasInfo extends DynamicData {
  @XmlElement(required = true)
  protected GuestAuthSubject subject;
  
  @XmlElement(required = true)
  protected String comment;
  
  public GuestAuthSubject getSubject() {
    return this.subject;
  }
  
  public void setSubject(GuestAuthSubject paramGuestAuthSubject) {
    this.subject = paramGuestAuthSubject;
  }
  
  public String getComment() {
    return this.comment;
  }
  
  public void setComment(String paramString) {
    this.comment = paramString;
  }
}
