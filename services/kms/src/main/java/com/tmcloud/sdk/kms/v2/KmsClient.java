package com.tmcloud.sdk.kms.v2;

import com.tmcloud.sdk.core.ClientBuilder;
import com.tmcloud.sdk.core.HcClient;
import com.tmcloud.sdk.core.invoker.SyncInvoker;
import com.tmcloud.sdk.kms.v2.model.BatchCreateKmsTagsRequest;
import com.tmcloud.sdk.kms.v2.model.BatchCreateKmsTagsResponse;
import com.tmcloud.sdk.kms.v2.model.CancelGrantRequest;
import com.tmcloud.sdk.kms.v2.model.CancelGrantResponse;
import com.tmcloud.sdk.kms.v2.model.CancelKeyDeletionRequest;
import com.tmcloud.sdk.kms.v2.model.CancelKeyDeletionResponse;
import com.tmcloud.sdk.kms.v2.model.CancelSelfGrantRequest;
import com.tmcloud.sdk.kms.v2.model.CancelSelfGrantResponse;
import com.tmcloud.sdk.kms.v2.model.CreateDatakeyRequest;
import com.tmcloud.sdk.kms.v2.model.CreateDatakeyResponse;
import com.tmcloud.sdk.kms.v2.model.CreateDatakeyWithoutPlaintextRequest;
import com.tmcloud.sdk.kms.v2.model.CreateDatakeyWithoutPlaintextResponse;
import com.tmcloud.sdk.kms.v2.model.CreateGrantRequest;
import com.tmcloud.sdk.kms.v2.model.CreateGrantResponse;
import com.tmcloud.sdk.kms.v2.model.CreateKeyRequest;
import com.tmcloud.sdk.kms.v2.model.CreateKeyResponse;
import com.tmcloud.sdk.kms.v2.model.CreateKeyStoreRequest;
import com.tmcloud.sdk.kms.v2.model.CreateKeyStoreResponse;
import com.tmcloud.sdk.kms.v2.model.CreateKmsTagRequest;
import com.tmcloud.sdk.kms.v2.model.CreateKmsTagResponse;
import com.tmcloud.sdk.kms.v2.model.CreateParametersForImportRequest;
import com.tmcloud.sdk.kms.v2.model.CreateParametersForImportResponse;
import com.tmcloud.sdk.kms.v2.model.CreateRandomRequest;
import com.tmcloud.sdk.kms.v2.model.CreateRandomResponse;
import com.tmcloud.sdk.kms.v2.model.DecryptDataRequest;
import com.tmcloud.sdk.kms.v2.model.DecryptDataResponse;
import com.tmcloud.sdk.kms.v2.model.DecryptDatakeyRequest;
import com.tmcloud.sdk.kms.v2.model.DecryptDatakeyResponse;
import com.tmcloud.sdk.kms.v2.model.DeleteImportedKeyMaterialRequest;
import com.tmcloud.sdk.kms.v2.model.DeleteImportedKeyMaterialResponse;
import com.tmcloud.sdk.kms.v2.model.DeleteKeyRequest;
import com.tmcloud.sdk.kms.v2.model.DeleteKeyResponse;
import com.tmcloud.sdk.kms.v2.model.DeleteKeyStoreRequest;
import com.tmcloud.sdk.kms.v2.model.DeleteKeyStoreResponse;
import com.tmcloud.sdk.kms.v2.model.DeleteTagRequest;
import com.tmcloud.sdk.kms.v2.model.DeleteTagResponse;
import com.tmcloud.sdk.kms.v2.model.DisableKeyRequest;
import com.tmcloud.sdk.kms.v2.model.DisableKeyResponse;
import com.tmcloud.sdk.kms.v2.model.DisableKeyRotationRequest;
import com.tmcloud.sdk.kms.v2.model.DisableKeyRotationResponse;
import com.tmcloud.sdk.kms.v2.model.DisableKeyStoreRequest;
import com.tmcloud.sdk.kms.v2.model.DisableKeyStoreResponse;
import com.tmcloud.sdk.kms.v2.model.EnableKeyRequest;
import com.tmcloud.sdk.kms.v2.model.EnableKeyResponse;
import com.tmcloud.sdk.kms.v2.model.EnableKeyRotationRequest;
import com.tmcloud.sdk.kms.v2.model.EnableKeyRotationResponse;
import com.tmcloud.sdk.kms.v2.model.EnableKeyStoreRequest;
import com.tmcloud.sdk.kms.v2.model.EnableKeyStoreResponse;
import com.tmcloud.sdk.kms.v2.model.EncryptDataRequest;
import com.tmcloud.sdk.kms.v2.model.EncryptDataResponse;
import com.tmcloud.sdk.kms.v2.model.EncryptDatakeyRequest;
import com.tmcloud.sdk.kms.v2.model.EncryptDatakeyResponse;
import com.tmcloud.sdk.kms.v2.model.ImportKeyMaterialRequest;
import com.tmcloud.sdk.kms.v2.model.ImportKeyMaterialResponse;
import com.tmcloud.sdk.kms.v2.model.ListGrantsRequest;
import com.tmcloud.sdk.kms.v2.model.ListGrantsResponse;
import com.tmcloud.sdk.kms.v2.model.ListKeyDetailRequest;
import com.tmcloud.sdk.kms.v2.model.ListKeyDetailResponse;
import com.tmcloud.sdk.kms.v2.model.ListKeyStoresRequest;
import com.tmcloud.sdk.kms.v2.model.ListKeyStoresResponse;
import com.tmcloud.sdk.kms.v2.model.ListKeysRequest;
import com.tmcloud.sdk.kms.v2.model.ListKeysResponse;
import com.tmcloud.sdk.kms.v2.model.ListKmsByTagsRequest;
import com.tmcloud.sdk.kms.v2.model.ListKmsByTagsResponse;
import com.tmcloud.sdk.kms.v2.model.ListKmsTagsRequest;
import com.tmcloud.sdk.kms.v2.model.ListKmsTagsResponse;
import com.tmcloud.sdk.kms.v2.model.ListRetirableGrantsRequest;
import com.tmcloud.sdk.kms.v2.model.ListRetirableGrantsResponse;
import com.tmcloud.sdk.kms.v2.model.ShowKeyRotationStatusRequest;
import com.tmcloud.sdk.kms.v2.model.ShowKeyRotationStatusResponse;
import com.tmcloud.sdk.kms.v2.model.ShowKeyStoreRequest;
import com.tmcloud.sdk.kms.v2.model.ShowKeyStoreResponse;
import com.tmcloud.sdk.kms.v2.model.ShowKmsTagsRequest;
import com.tmcloud.sdk.kms.v2.model.ShowKmsTagsResponse;
import com.tmcloud.sdk.kms.v2.model.ShowPublicKeyRequest;
import com.tmcloud.sdk.kms.v2.model.ShowPublicKeyResponse;
import com.tmcloud.sdk.kms.v2.model.ShowUserInstancesRequest;
import com.tmcloud.sdk.kms.v2.model.ShowUserInstancesResponse;
import com.tmcloud.sdk.kms.v2.model.ShowUserQuotasRequest;
import com.tmcloud.sdk.kms.v2.model.ShowUserQuotasResponse;
import com.tmcloud.sdk.kms.v2.model.ShowVersionRequest;
import com.tmcloud.sdk.kms.v2.model.ShowVersionResponse;
import com.tmcloud.sdk.kms.v2.model.ShowVersionsRequest;
import com.tmcloud.sdk.kms.v2.model.ShowVersionsResponse;
import com.tmcloud.sdk.kms.v2.model.SignRequest;
import com.tmcloud.sdk.kms.v2.model.SignResponse;
import com.tmcloud.sdk.kms.v2.model.UpdateKeyAliasRequest;
import com.tmcloud.sdk.kms.v2.model.UpdateKeyAliasResponse;
import com.tmcloud.sdk.kms.v2.model.UpdateKeyDescriptionRequest;
import com.tmcloud.sdk.kms.v2.model.UpdateKeyDescriptionResponse;
import com.tmcloud.sdk.kms.v2.model.UpdateKeyRotationIntervalRequest;
import com.tmcloud.sdk.kms.v2.model.UpdateKeyRotationIntervalResponse;
import com.tmcloud.sdk.kms.v2.model.ValidateSignatureRequest;
import com.tmcloud.sdk.kms.v2.model.ValidateSignatureResponse;

public class KmsClient {

    protected HcClient hcClient;

    public KmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KmsClient> newBuilder() {
        ClientBuilder<KmsClient> clientBuilder = new ClientBuilder<>(KmsClient::new);
        return clientBuilder;
    }

    public BatchCreateKmsTagsResponse batchCreateKmsTags(BatchCreateKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
    }

    public SyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTagsInvoker(
        BatchCreateKmsTagsRequest request) {
        return new SyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse>(request,
            KmsMeta.batchCreateKmsTags, hcClient);
    }

    public CancelGrantResponse cancelGrant(CancelGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelGrant);
    }

    public SyncInvoker<CancelGrantRequest, CancelGrantResponse> cancelGrantInvoker(CancelGrantRequest request) {
        return new SyncInvoker<CancelGrantRequest, CancelGrantResponse>(request, KmsMeta.cancelGrant, hcClient);
    }

    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
    }

    public SyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletionInvoker(
        CancelKeyDeletionRequest request) {
        return new SyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse>(request, KmsMeta.cancelKeyDeletion,
            hcClient);
    }

    public CancelSelfGrantResponse cancelSelfGrant(CancelSelfGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelSelfGrant);
    }

    public SyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrantInvoker(
        CancelSelfGrantRequest request) {
        return new SyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse>(request, KmsMeta.cancelSelfGrant,
            hcClient);
    }

    public CreateDatakeyResponse createDatakey(CreateDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakey);
    }

    public SyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse> createDatakeyInvoker(CreateDatakeyRequest request) {
        return new SyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse>(request, KmsMeta.createDatakey, hcClient);
    }

    public CreateDatakeyWithoutPlaintextResponse createDatakeyWithoutPlaintext(
        CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
    }

    public SyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextInvoker(
        CreateDatakeyWithoutPlaintextRequest request) {
        return new SyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse>(request,
            KmsMeta.createDatakeyWithoutPlaintext, hcClient);
    }

    public CreateGrantResponse createGrant(CreateGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createGrant);
    }

    public SyncInvoker<CreateGrantRequest, CreateGrantResponse> createGrantInvoker(CreateGrantRequest request) {
        return new SyncInvoker<CreateGrantRequest, CreateGrantResponse>(request, KmsMeta.createGrant, hcClient);
    }

    public CreateKeyResponse createKey(CreateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKey);
    }

    public SyncInvoker<CreateKeyRequest, CreateKeyResponse> createKeyInvoker(CreateKeyRequest request) {
        return new SyncInvoker<CreateKeyRequest, CreateKeyResponse>(request, KmsMeta.createKey, hcClient);
    }

    public CreateKeyStoreResponse createKeyStore(CreateKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKeyStore);
    }

    public SyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse> createKeyStoreInvoker(
        CreateKeyStoreRequest request) {
        return new SyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse>(request, KmsMeta.createKeyStore,
            hcClient);
    }

    public CreateKmsTagResponse createKmsTag(CreateKmsTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKmsTag);
    }

    public SyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTagInvoker(CreateKmsTagRequest request) {
        return new SyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse>(request, KmsMeta.createKmsTag, hcClient);
    }

    public CreateParametersForImportResponse createParametersForImport(CreateParametersForImportRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createParametersForImport);
    }

    public SyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImportInvoker(
        CreateParametersForImportRequest request) {
        return new SyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse>(request,
            KmsMeta.createParametersForImport, hcClient);
    }

    public CreateRandomResponse createRandom(CreateRandomRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createRandom);
    }

    public SyncInvoker<CreateRandomRequest, CreateRandomResponse> createRandomInvoker(CreateRandomRequest request) {
        return new SyncInvoker<CreateRandomRequest, CreateRandomResponse>(request, KmsMeta.createRandom, hcClient);
    }

    public DecryptDataResponse decryptData(DecryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptData);
    }

    public SyncInvoker<DecryptDataRequest, DecryptDataResponse> decryptDataInvoker(DecryptDataRequest request) {
        return new SyncInvoker<DecryptDataRequest, DecryptDataResponse>(request, KmsMeta.decryptData, hcClient);
    }

    public DecryptDatakeyResponse decryptDatakey(DecryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptDatakey);
    }

    public SyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakeyInvoker(
        DecryptDatakeyRequest request) {
        return new SyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse>(request, KmsMeta.decryptDatakey,
            hcClient);
    }

    public DeleteImportedKeyMaterialResponse deleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
    }

    public SyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialInvoker(
        DeleteImportedKeyMaterialRequest request) {
        return new SyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse>(request,
            KmsMeta.deleteImportedKeyMaterial, hcClient);
    }

    public DeleteKeyResponse deleteKey(DeleteKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteKey);
    }

    public SyncInvoker<DeleteKeyRequest, DeleteKeyResponse> deleteKeyInvoker(DeleteKeyRequest request) {
        return new SyncInvoker<DeleteKeyRequest, DeleteKeyResponse>(request, KmsMeta.deleteKey, hcClient);
    }

    public DeleteKeyStoreResponse deleteKeyStore(DeleteKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteKeyStore);
    }

    public SyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse> deleteKeyStoreInvoker(
        DeleteKeyStoreRequest request) {
        return new SyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse>(request, KmsMeta.deleteKeyStore,
            hcClient);
    }

    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteTag);
    }

    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, KmsMeta.deleteTag, hcClient);
    }

    public DisableKeyResponse disableKey(DisableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKey);
    }

    public SyncInvoker<DisableKeyRequest, DisableKeyResponse> disableKeyInvoker(DisableKeyRequest request) {
        return new SyncInvoker<DisableKeyRequest, DisableKeyResponse>(request, KmsMeta.disableKey, hcClient);
    }

    public DisableKeyRotationResponse disableKeyRotation(DisableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKeyRotation);
    }

    public SyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotationInvoker(
        DisableKeyRotationRequest request) {
        return new SyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse>(request,
            KmsMeta.disableKeyRotation, hcClient);
    }

    public DisableKeyStoreResponse disableKeyStore(DisableKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKeyStore);
    }

    public SyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse> disableKeyStoreInvoker(
        DisableKeyStoreRequest request) {
        return new SyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse>(request, KmsMeta.disableKeyStore,
            hcClient);
    }

    public EnableKeyResponse enableKey(EnableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKey);
    }

    public SyncInvoker<EnableKeyRequest, EnableKeyResponse> enableKeyInvoker(EnableKeyRequest request) {
        return new SyncInvoker<EnableKeyRequest, EnableKeyResponse>(request, KmsMeta.enableKey, hcClient);
    }

    public EnableKeyRotationResponse enableKeyRotation(EnableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKeyRotation);
    }

    public SyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotationInvoker(
        EnableKeyRotationRequest request) {
        return new SyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse>(request, KmsMeta.enableKeyRotation,
            hcClient);
    }

    public EnableKeyStoreResponse enableKeyStore(EnableKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKeyStore);
    }

    public SyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse> enableKeyStoreInvoker(
        EnableKeyStoreRequest request) {
        return new SyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse>(request, KmsMeta.enableKeyStore,
            hcClient);
    }

    public EncryptDataResponse encryptData(EncryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptData);
    }

    public SyncInvoker<EncryptDataRequest, EncryptDataResponse> encryptDataInvoker(EncryptDataRequest request) {
        return new SyncInvoker<EncryptDataRequest, EncryptDataResponse>(request, KmsMeta.encryptData, hcClient);
    }

    public EncryptDatakeyResponse encryptDatakey(EncryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptDatakey);
    }

    public SyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakeyInvoker(
        EncryptDatakeyRequest request) {
        return new SyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse>(request, KmsMeta.encryptDatakey,
            hcClient);
    }

    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.importKeyMaterial);
    }

    public SyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterialInvoker(
        ImportKeyMaterialRequest request) {
        return new SyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse>(request, KmsMeta.importKeyMaterial,
            hcClient);
    }

    public ListGrantsResponse listGrants(ListGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listGrants);
    }

    public SyncInvoker<ListGrantsRequest, ListGrantsResponse> listGrantsInvoker(ListGrantsRequest request) {
        return new SyncInvoker<ListGrantsRequest, ListGrantsResponse>(request, KmsMeta.listGrants, hcClient);
    }

    public ListKeyDetailResponse listKeyDetail(ListKeyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeyDetail);
    }

    public SyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetailInvoker(ListKeyDetailRequest request) {
        return new SyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse>(request, KmsMeta.listKeyDetail, hcClient);
    }

    public ListKeyStoresResponse listKeyStores(ListKeyStoresRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeyStores);
    }

    public SyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse> listKeyStoresInvoker(ListKeyStoresRequest request) {
        return new SyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse>(request, KmsMeta.listKeyStores, hcClient);
    }

    public ListKeysResponse listKeys(ListKeysRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeys);
    }

    public SyncInvoker<ListKeysRequest, ListKeysResponse> listKeysInvoker(ListKeysRequest request) {
        return new SyncInvoker<ListKeysRequest, ListKeysResponse>(request, KmsMeta.listKeys, hcClient);
    }

    public ListKmsByTagsResponse listKmsByTags(ListKmsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsByTags);
    }

    public SyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTagsInvoker(ListKmsByTagsRequest request) {
        return new SyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse>(request, KmsMeta.listKmsByTags, hcClient);
    }

    public ListKmsTagsResponse listKmsTags(ListKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsTags);
    }

    public SyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTagsInvoker(ListKmsTagsRequest request) {
        return new SyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse>(request, KmsMeta.listKmsTags, hcClient);
    }

    public ListRetirableGrantsResponse listRetirableGrants(ListRetirableGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listRetirableGrants);
    }

    public SyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrantsInvoker(
        ListRetirableGrantsRequest request) {
        return new SyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse>(request,
            KmsMeta.listRetirableGrants, hcClient);
    }

    public ShowKeyRotationStatusResponse showKeyRotationStatus(ShowKeyRotationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
    }

    public SyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatusInvoker(
        ShowKeyRotationStatusRequest request) {
        return new SyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse>(request,
            KmsMeta.showKeyRotationStatus, hcClient);
    }

    public ShowKeyStoreResponse showKeyStore(ShowKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKeyStore);
    }

    public SyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse> showKeyStoreInvoker(ShowKeyStoreRequest request) {
        return new SyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse>(request, KmsMeta.showKeyStore, hcClient);
    }

    public ShowKmsTagsResponse showKmsTags(ShowKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKmsTags);
    }

    public SyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTagsInvoker(ShowKmsTagsRequest request) {
        return new SyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse>(request, KmsMeta.showKmsTags, hcClient);
    }

    public ShowPublicKeyResponse showPublicKey(ShowPublicKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showPublicKey);
    }

    public SyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse> showPublicKeyInvoker(ShowPublicKeyRequest request) {
        return new SyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse>(request, KmsMeta.showPublicKey, hcClient);
    }

    public ShowUserInstancesResponse showUserInstances(ShowUserInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserInstances);
    }

    public SyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstancesInvoker(
        ShowUserInstancesRequest request) {
        return new SyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse>(request, KmsMeta.showUserInstances,
            hcClient);
    }

    public ShowUserQuotasResponse showUserQuotas(ShowUserQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserQuotas);
    }

    public SyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotasInvoker(
        ShowUserQuotasRequest request) {
        return new SyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse>(request, KmsMeta.showUserQuotas,
            hcClient);
    }

    public SignResponse sign(SignRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.sign);
    }

    public SyncInvoker<SignRequest, SignResponse> signInvoker(SignRequest request) {
        return new SyncInvoker<SignRequest, SignResponse>(request, KmsMeta.sign, hcClient);
    }

    public UpdateKeyAliasResponse updateKeyAlias(UpdateKeyAliasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyAlias);
    }

    public SyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAliasInvoker(
        UpdateKeyAliasRequest request) {
        return new SyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse>(request, KmsMeta.updateKeyAlias,
            hcClient);
    }

    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyDescription);
    }

    public SyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescriptionInvoker(
        UpdateKeyDescriptionRequest request) {
        return new SyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse>(request,
            KmsMeta.updateKeyDescription, hcClient);
    }

    public UpdateKeyRotationIntervalResponse updateKeyRotationInterval(UpdateKeyRotationIntervalRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
    }

    public SyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalInvoker(
        UpdateKeyRotationIntervalRequest request) {
        return new SyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse>(request,
            KmsMeta.updateKeyRotationInterval, hcClient);
    }

    public ValidateSignatureResponse validateSignature(ValidateSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.validateSignature);
    }

    public SyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse> validateSignatureInvoker(
        ValidateSignatureRequest request) {
        return new SyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse>(request, KmsMeta.validateSignature,
            hcClient);
    }

    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersion);
    }

    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, KmsMeta.showVersion, hcClient);
    }

    public ShowVersionsResponse showVersions(ShowVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersions);
    }

    public SyncInvoker<ShowVersionsRequest, ShowVersionsResponse> showVersionsInvoker(ShowVersionsRequest request) {
        return new SyncInvoker<ShowVersionsRequest, ShowVersionsResponse>(request, KmsMeta.showVersions, hcClient);
    }

}
