package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtSolutionManagerInfo;
import com.vmware.vim25.ExtSolutionManagerInfoTabInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtSolutionManagerInfo", propOrder = {"tab", "smallIconUrl"})
public class ExtSolutionManagerInfo extends DynamicData {
  protected List<ExtSolutionManagerInfoTabInfo> tab;
  
  protected String smallIconUrl;
  
  public List<ExtSolutionManagerInfoTabInfo> getTab() {
    if (this.tab == null)
      this.tab = new ArrayList<>(); 
    return this.tab;
  }
  
  public String getSmallIconUrl() {
    return this.smallIconUrl;
  }
  
  public void setSmallIconUrl(String paramString) {
    this.smallIconUrl = paramString;
  }
}
