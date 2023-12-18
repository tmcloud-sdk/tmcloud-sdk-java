package com.tmcloud.sdk.kms.v2;

import com.tmcloud.sdk.core.ClientBuilder;
import com.tmcloud.sdk.core.HcClient;
import com.tmcloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class KmsAsyncClient {

    protected HcClient hcClient;

    public KmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KmsAsyncClient> newBuilder() {
        ClientBuilder<KmsAsyncClient> clientBuilder = new ClientBuilder<>(KmsAsyncClient::new);
        return clientBuilder;
    }

    public CompletableFuture<BatchCreateKmsTagsResponse> batchCreateKmsTagsAsync(BatchCreateKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
    }

    public AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTagsAsyncInvoker(
        BatchCreateKmsTagsRequest request) {
        return new AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse>(request,
            KmsMeta.batchCreateKmsTags, hcClient);
    }

    public CompletableFuture<CancelGrantResponse> cancelGrantAsync(CancelGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelGrant);
    }

    public AsyncInvoker<CancelGrantRequest, CancelGrantResponse> cancelGrantAsyncInvoker(CancelGrantRequest request) {
        return new AsyncInvoker<CancelGrantRequest, CancelGrantResponse>(request, KmsMeta.cancelGrant, hcClient);
    }

    public CompletableFuture<CancelKeyDeletionResponse> cancelKeyDeletionAsync(CancelKeyDeletionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
    }

    public AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletionAsyncInvoker(
        CancelKeyDeletionRequest request) {
        return new AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse>(request, KmsMeta.cancelKeyDeletion,
            hcClient);
    }

    public CompletableFuture<CancelSelfGrantResponse> cancelSelfGrantAsync(CancelSelfGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelSelfGrant);
    }

    public AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrantAsyncInvoker(
        CancelSelfGrantRequest request) {
        return new AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse>(request, KmsMeta.cancelSelfGrant,
            hcClient);
    }

    public CompletableFuture<CreateDatakeyResponse> createDatakeyAsync(CreateDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakey);
    }

    public AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse> createDatakeyAsyncInvoker(
        CreateDatakeyRequest request) {
        return new AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse>(request, KmsMeta.createDatakey, hcClient);
    }

    public CompletableFuture<CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextAsync(
        CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
    }

    public AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextAsyncInvoker(
        CreateDatakeyWithoutPlaintextRequest request) {
        return new AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse>(request,
            KmsMeta.createDatakeyWithoutPlaintext, hcClient);
    }

    public CompletableFuture<CreateGrantResponse> createGrantAsync(CreateGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createGrant);
    }

    public AsyncInvoker<CreateGrantRequest, CreateGrantResponse> createGrantAsyncInvoker(CreateGrantRequest request) {
        return new AsyncInvoker<CreateGrantRequest, CreateGrantResponse>(request, KmsMeta.createGrant, hcClient);
    }

    public CompletableFuture<CreateKeyResponse> createKeyAsync(CreateKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKey);
    }

    public AsyncInvoker<CreateKeyRequest, CreateKeyResponse> createKeyAsyncInvoker(CreateKeyRequest request) {
        return new AsyncInvoker<CreateKeyRequest, CreateKeyResponse>(request, KmsMeta.createKey, hcClient);
    }

    public CompletableFuture<CreateKeyStoreResponse> createKeyStoreAsync(CreateKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKeyStore);
    }

    public AsyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse> createKeyStoreAsyncInvoker(
        CreateKeyStoreRequest request) {
        return new AsyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse>(request, KmsMeta.createKeyStore,
            hcClient);
    }

    public CompletableFuture<CreateKmsTagResponse> createKmsTagAsync(CreateKmsTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKmsTag);
    }

    public AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTagAsyncInvoker(
        CreateKmsTagRequest request) {
        return new AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse>(request, KmsMeta.createKmsTag, hcClient);
    }

    public CompletableFuture<CreateParametersForImportResponse> createParametersForImportAsync(
        CreateParametersForImportRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createParametersForImport);
    }

    public AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImportAsyncInvoker(
        CreateParametersForImportRequest request) {
        return new AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse>(request,
            KmsMeta.createParametersForImport, hcClient);
    }

    public CompletableFuture<CreateRandomResponse> createRandomAsync(CreateRandomRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createRandom);
    }

    public AsyncInvoker<CreateRandomRequest, CreateRandomResponse> createRandomAsyncInvoker(
        CreateRandomRequest request) {
        return new AsyncInvoker<CreateRandomRequest, CreateRandomResponse>(request, KmsMeta.createRandom, hcClient);
    }

    public CompletableFuture<DecryptDataResponse> decryptDataAsync(DecryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptData);
    }

    public AsyncInvoker<DecryptDataRequest, DecryptDataResponse> decryptDataAsyncInvoker(DecryptDataRequest request) {
        return new AsyncInvoker<DecryptDataRequest, DecryptDataResponse>(request, KmsMeta.decryptData, hcClient);
    }

    public CompletableFuture<DecryptDatakeyResponse> decryptDatakeyAsync(DecryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptDatakey);
    }

    public AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakeyAsyncInvoker(
        DecryptDatakeyRequest request) {
        return new AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse>(request, KmsMeta.decryptDatakey,
            hcClient);
    }

    public CompletableFuture<DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialAsync(
        DeleteImportedKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
    }

    public AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialAsyncInvoker(
        DeleteImportedKeyMaterialRequest request) {
        return new AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse>(request,
            KmsMeta.deleteImportedKeyMaterial, hcClient);
    }

    public CompletableFuture<DeleteKeyResponse> deleteKeyAsync(DeleteKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteKey);
    }

    public AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse> deleteKeyAsyncInvoker(DeleteKeyRequest request) {
        return new AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse>(request, KmsMeta.deleteKey, hcClient);
    }

    public CompletableFuture<DeleteKeyStoreResponse> deleteKeyStoreAsync(DeleteKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteKeyStore);
    }

    public AsyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse> deleteKeyStoreAsyncInvoker(
        DeleteKeyStoreRequest request) {
        return new AsyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse>(request, KmsMeta.deleteKeyStore,
            hcClient);
    }

    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteTag);
    }

    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, KmsMeta.deleteTag, hcClient);
    }

    public CompletableFuture<DisableKeyResponse> disableKeyAsync(DisableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKey);
    }

    public AsyncInvoker<DisableKeyRequest, DisableKeyResponse> disableKeyAsyncInvoker(DisableKeyRequest request) {
        return new AsyncInvoker<DisableKeyRequest, DisableKeyResponse>(request, KmsMeta.disableKey, hcClient);
    }

    public CompletableFuture<DisableKeyRotationResponse> disableKeyRotationAsync(DisableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKeyRotation);
    }

    public AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotationAsyncInvoker(
        DisableKeyRotationRequest request) {
        return new AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse>(request,
            KmsMeta.disableKeyRotation, hcClient);
    }

    public CompletableFuture<DisableKeyStoreResponse> disableKeyStoreAsync(DisableKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKeyStore);
    }

    public AsyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse> disableKeyStoreAsyncInvoker(
        DisableKeyStoreRequest request) {
        return new AsyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse>(request, KmsMeta.disableKeyStore,
            hcClient);
    }

    public CompletableFuture<EnableKeyResponse> enableKeyAsync(EnableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKey);
    }

    public AsyncInvoker<EnableKeyRequest, EnableKeyResponse> enableKeyAsyncInvoker(EnableKeyRequest request) {
        return new AsyncInvoker<EnableKeyRequest, EnableKeyResponse>(request, KmsMeta.enableKey, hcClient);
    }

    public CompletableFuture<EnableKeyRotationResponse> enableKeyRotationAsync(EnableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKeyRotation);
    }

    public AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotationAsyncInvoker(
        EnableKeyRotationRequest request) {
        return new AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse>(request, KmsMeta.enableKeyRotation,
            hcClient);
    }

    public CompletableFuture<EnableKeyStoreResponse> enableKeyStoreAsync(EnableKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKeyStore);
    }

    public AsyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse> enableKeyStoreAsyncInvoker(
        EnableKeyStoreRequest request) {
        return new AsyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse>(request, KmsMeta.enableKeyStore,
            hcClient);
    }

    public CompletableFuture<EncryptDataResponse> encryptDataAsync(EncryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptData);
    }

    public AsyncInvoker<EncryptDataRequest, EncryptDataResponse> encryptDataAsyncInvoker(EncryptDataRequest request) {
        return new AsyncInvoker<EncryptDataRequest, EncryptDataResponse>(request, KmsMeta.encryptData, hcClient);
    }

    public CompletableFuture<EncryptDatakeyResponse> encryptDatakeyAsync(EncryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptDatakey);
    }

    public AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakeyAsyncInvoker(
        EncryptDatakeyRequest request) {
        return new AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse>(request, KmsMeta.encryptDatakey,
            hcClient);
    }

    public CompletableFuture<ImportKeyMaterialResponse> importKeyMaterialAsync(ImportKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.importKeyMaterial);
    }

    public AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterialAsyncInvoker(
        ImportKeyMaterialRequest request) {
        return new AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse>(request, KmsMeta.importKeyMaterial,
            hcClient);
    }

    public CompletableFuture<ListGrantsResponse> listGrantsAsync(ListGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listGrants);
    }

    public AsyncInvoker<ListGrantsRequest, ListGrantsResponse> listGrantsAsyncInvoker(ListGrantsRequest request) {
        return new AsyncInvoker<ListGrantsRequest, ListGrantsResponse>(request, KmsMeta.listGrants, hcClient);
    }

    public CompletableFuture<ListKeyDetailResponse> listKeyDetailAsync(ListKeyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeyDetail);
    }

    public AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetailAsyncInvoker(
        ListKeyDetailRequest request) {
        return new AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse>(request, KmsMeta.listKeyDetail, hcClient);
    }

    public CompletableFuture<ListKeyStoresResponse> listKeyStoresAsync(ListKeyStoresRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeyStores);
    }

    public AsyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse> listKeyStoresAsyncInvoker(
        ListKeyStoresRequest request) {
        return new AsyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse>(request, KmsMeta.listKeyStores, hcClient);
    }

    public CompletableFuture<ListKeysResponse> listKeysAsync(ListKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeys);
    }

    public AsyncInvoker<ListKeysRequest, ListKeysResponse> listKeysAsyncInvoker(ListKeysRequest request) {
        return new AsyncInvoker<ListKeysRequest, ListKeysResponse>(request, KmsMeta.listKeys, hcClient);
    }

    public CompletableFuture<ListKmsByTagsResponse> listKmsByTagsAsync(ListKmsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsByTags);
    }

    public AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTagsAsyncInvoker(
        ListKmsByTagsRequest request) {
        return new AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse>(request, KmsMeta.listKmsByTags, hcClient);
    }

    public CompletableFuture<ListKmsTagsResponse> listKmsTagsAsync(ListKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsTags);
    }

    public AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTagsAsyncInvoker(ListKmsTagsRequest request) {
        return new AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse>(request, KmsMeta.listKmsTags, hcClient);
    }

    public CompletableFuture<ListRetirableGrantsResponse> listRetirableGrantsAsync(ListRetirableGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listRetirableGrants);
    }

    public AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrantsAsyncInvoker(
        ListRetirableGrantsRequest request) {
        return new AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse>(request,
            KmsMeta.listRetirableGrants, hcClient);
    }

    public CompletableFuture<ShowKeyRotationStatusResponse> showKeyRotationStatusAsync(
        ShowKeyRotationStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
    }

    public AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatusAsyncInvoker(
        ShowKeyRotationStatusRequest request) {
        return new AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse>(request,
            KmsMeta.showKeyRotationStatus, hcClient);
    }

    public CompletableFuture<ShowKeyStoreResponse> showKeyStoreAsync(ShowKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKeyStore);
    }

    public AsyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse> showKeyStoreAsyncInvoker(
        ShowKeyStoreRequest request) {
        return new AsyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse>(request, KmsMeta.showKeyStore, hcClient);
    }

    public CompletableFuture<ShowKmsTagsResponse> showKmsTagsAsync(ShowKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKmsTags);
    }

    public AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTagsAsyncInvoker(ShowKmsTagsRequest request) {
        return new AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse>(request, KmsMeta.showKmsTags, hcClient);
    }

    public CompletableFuture<ShowPublicKeyResponse> showPublicKeyAsync(ShowPublicKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showPublicKey);
    }

    public AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse> showPublicKeyAsyncInvoker(
        ShowPublicKeyRequest request) {
        return new AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse>(request, KmsMeta.showPublicKey, hcClient);
    }

    public CompletableFuture<ShowUserInstancesResponse> showUserInstancesAsync(ShowUserInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserInstances);
    }

    public AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstancesAsyncInvoker(
        ShowUserInstancesRequest request) {
        return new AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse>(request, KmsMeta.showUserInstances,
            hcClient);
    }

    public CompletableFuture<ShowUserQuotasResponse> showUserQuotasAsync(ShowUserQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserQuotas);
    }

    public AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotasAsyncInvoker(
        ShowUserQuotasRequest request) {
        return new AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse>(request, KmsMeta.showUserQuotas,
            hcClient);
    }

    public CompletableFuture<SignResponse> signAsync(SignRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.sign);
    }

    public AsyncInvoker<SignRequest, SignResponse> signAsyncInvoker(SignRequest request) {
        return new AsyncInvoker<SignRequest, SignResponse>(request, KmsMeta.sign, hcClient);
    }

    public CompletableFuture<UpdateKeyAliasResponse> updateKeyAliasAsync(UpdateKeyAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyAlias);
    }

    public AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAliasAsyncInvoker(
        UpdateKeyAliasRequest request) {
        return new AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse>(request, KmsMeta.updateKeyAlias,
            hcClient);
    }

    public CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescriptionAsync(
        UpdateKeyDescriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyDescription);
    }

    public AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescriptionAsyncInvoker(
        UpdateKeyDescriptionRequest request) {
        return new AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse>(request,
            KmsMeta.updateKeyDescription, hcClient);
    }

    public CompletableFuture<UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalAsync(
        UpdateKeyRotationIntervalRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
    }

    public AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalAsyncInvoker(
        UpdateKeyRotationIntervalRequest request) {
        return new AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse>(request,
            KmsMeta.updateKeyRotationInterval, hcClient);
    }

    public CompletableFuture<ValidateSignatureResponse> validateSignatureAsync(ValidateSignatureRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.validateSignature);
    }

    public AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse> validateSignatureAsyncInvoker(
        ValidateSignatureRequest request) {
        return new AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse>(request, KmsMeta.validateSignature,
            hcClient);
    }

    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersion);
    }

    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, KmsMeta.showVersion, hcClient);
    }

    public CompletableFuture<ShowVersionsResponse> showVersionsAsync(ShowVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersions);
    }

    public AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse> showVersionsAsyncInvoker(
        ShowVersionsRequest request) {
        return new AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse>(request, KmsMeta.showVersions, hcClient);
    }

}
