package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ImportSpec;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.OvfCreateImportSpecResult;
import com.vmware.vim25.OvfFileItem;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfCreateImportSpecResult", propOrder = {"importSpec", "fileItem", "warning", "error"})
public class OvfCreateImportSpecResult extends DynamicData {
  protected ImportSpec importSpec;
  
  protected List<OvfFileItem> fileItem;
  
  protected List<LocalizedMethodFault> warning;
  
  protected List<LocalizedMethodFault> error;
  
  public ImportSpec getImportSpec() {
    return this.importSpec;
  }
  
  public void setImportSpec(ImportSpec paramImportSpec) {
    this.importSpec = paramImportSpec;
  }
  
  public List<OvfFileItem> getFileItem() {
    if (this.fileItem == null)
      this.fileItem = new ArrayList<>(); 
    return this.fileItem;
  }
  
  public List<LocalizedMethodFault> getWarning() {
    if (this.warning == null)
      this.warning = new ArrayList<>(); 
    return this.warning;
  }
  
  public List<LocalizedMethodFault> getError() {
    if (this.error == null)
      this.error = new ArrayList<>(); 
    return this.error;
  }
}
