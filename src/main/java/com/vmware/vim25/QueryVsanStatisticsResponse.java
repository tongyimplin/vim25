package com.vmware.vim25;

import com.vmware.vim25.QueryVsanStatisticsResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryVsanStatisticsResponse")
public class QueryVsanStatisticsResponse {
  @XmlElement(required = true)
  protected String returnval;
  
  public String getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(String paramString) {
    this.returnval = paramString;
  }
}