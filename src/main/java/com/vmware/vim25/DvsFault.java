package com.vmware.vim25;

import com.vmware.vim25.BackupBlobReadFailure;
import com.vmware.vim25.BackupBlobWriteFailure;
import com.vmware.vim25.CollectorAddressUnset;
import com.vmware.vim25.ConflictingConfiguration;
import com.vmware.vim25.DvsApplyOperationFault;
import com.vmware.vim25.DvsNotAuthorized;
import com.vmware.vim25.DvsOperationBulkFault;
import com.vmware.vim25.DvsScopeViolated;
import com.vmware.vim25.ImportHostAddFailure;
import com.vmware.vim25.ImportOperationBulkFault;
import com.vmware.vim25.InvalidIpfixConfig;
import com.vmware.vim25.RollbackFailure;
import com.vmware.vim25.SwitchIpUnset;
import com.vmware.vim25.SwitchNotInUpgradeMode;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VspanDestPortConflict;
import com.vmware.vim25.VspanPortConflict;
import com.vmware.vim25.VspanPortMoveFault;
import com.vmware.vim25.VspanPortPromiscChangeFault;
import com.vmware.vim25.VspanPortgroupPromiscChangeFault;
import com.vmware.vim25.VspanPortgroupTypeChangeFault;
import com.vmware.vim25.VspanPromiscuousPortNotSupported;
import com.vmware.vim25.VspanSameSessionPortConflict;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsFault")
@XmlSeeAlso({VspanSameSessionPortConflict.class, CollectorAddressUnset.class, VspanPortMoveFault.class, DvsOperationBulkFault.class, BackupBlobReadFailure.class, DvsScopeViolated.class, RollbackFailure.class, SwitchNotInUpgradeMode.class, VspanPortConflict.class, VspanPortgroupPromiscChangeFault.class, ImportOperationBulkFault.class, SwitchIpUnset.class, VspanPortgroupTypeChangeFault.class, ConflictingConfiguration.class, VspanPortPromiscChangeFault.class, ImportHostAddFailure.class, VspanDestPortConflict.class, DvsApplyOperationFault.class, BackupBlobWriteFailure.class, InvalidIpfixConfig.class, DvsNotAuthorized.class, VspanPromiscuousPortNotSupported.class})
public class DvsFault extends VimFault {}
