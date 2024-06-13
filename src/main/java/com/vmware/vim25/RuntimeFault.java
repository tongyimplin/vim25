package com.vmware.vim25;

import com.vmware.vim25.CannotDisableDrsOnClustersWithVApps;
import com.vmware.vim25.ConflictingDatastoreFound;
import com.vmware.vim25.DatabaseError;
import com.vmware.vim25.DisallowedChangeByService;
import com.vmware.vim25.DisallowedOperationOnFailoverHost;
import com.vmware.vim25.FailToLockFaultToleranceVMs;
import com.vmware.vim25.HostCommunication;
import com.vmware.vim25.InvalidArgument;
import com.vmware.vim25.InvalidProfileReferenceHost;
import com.vmware.vim25.InvalidRequest;
import com.vmware.vim25.LicenseAssignmentFailed;
import com.vmware.vim25.ManagedObjectNotFound;
import com.vmware.vim25.MethodAlreadyDisabledFault;
import com.vmware.vim25.MethodDisabled;
import com.vmware.vim25.MethodFault;
import com.vmware.vim25.NotEnoughLicenses;
import com.vmware.vim25.NotImplemented;
import com.vmware.vim25.NotSupported;
import com.vmware.vim25.OperationDisallowedOnHost;
import com.vmware.vim25.RequestCanceled;
import com.vmware.vim25.RestrictedByAdministrator;
import com.vmware.vim25.SecurityError;
import com.vmware.vim25.SystemError;
import com.vmware.vim25.ThirdPartyLicenseAssignmentFailed;
import com.vmware.vim25.UnexpectedFault;
import com.vmware.vim25.VAppOperationInProgress;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeFault")
@XmlSeeAlso({ManagedObjectNotFound.class, CannotDisableDrsOnClustersWithVApps.class, LicenseAssignmentFailed.class, MethodDisabled.class, InvalidProfileReferenceHost.class, NotImplemented.class, MethodAlreadyDisabledFault.class, UnexpectedFault.class, RequestCanceled.class, DisallowedOperationOnFailoverHost.class, VAppOperationInProgress.class, InvalidRequest.class, ConflictingDatastoreFound.class, DatabaseError.class, FailToLockFaultToleranceVMs.class, OperationDisallowedOnHost.class, RestrictedByAdministrator.class, ThirdPartyLicenseAssignmentFailed.class, HostCommunication.class, DisallowedChangeByService.class, NotSupported.class, SystemError.class, NotEnoughLicenses.class, InvalidArgument.class, SecurityError.class})
public class RuntimeFault extends MethodFault {}
