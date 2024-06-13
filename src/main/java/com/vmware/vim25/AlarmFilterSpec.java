package com.vmware.vim25;

import com.vmware.vim25.AlarmFilterSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmFilterSpec", propOrder = {"status", "typeEntity", "typeTrigger"})
public class AlarmFilterSpec extends DynamicData {
  protected List<ManagedEntityStatus> status;
  
  protected String typeEntity;
  
  protected String typeTrigger;
  
  public List<ManagedEntityStatus> getStatus() {
    if (this.status == null)
      this.status = new ArrayList<>(); 
    return this.status;
  }
  
  public String getTypeEntity() {
    return this.typeEntity;
  }
  
  public void setTypeEntity(String paramString) {
    this.typeEntity = paramString;
  }
  
  public String getTypeTrigger() {
    return this.typeTrigger;
  }
  
  public void setTypeTrigger(String paramString) {
    this.typeTrigger = paramString;
  }
}
